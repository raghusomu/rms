package com.rms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.dto.RateBean;
import com.rms.exceptions.RateIdNotFoundException;
import com.rms.service.RateService;

@RestController
public class RateController {
	
	@Autowired
	private RateService rateService;
	
	@GetMapping("/searchRate")
	//@HystrixCommand(fallbackMethod = "fallbackretriveAllRateIds")
	public ResponseEntity<List<RateBean>> retriveAllRateIds(){
		  
		List<RateBean> rateBeans = rateService.retriveAllRateIds();
		 
		 return new ResponseEntity<List<RateBean>>(rateBeans,HttpStatus.OK);
	
	}
	
//	public List<RateBean> fallbackretriveAllRateIds(){
//		return Arrays.asList(new RateBean());
//	}
//	public RateBean fallbackretriveAllRateIds(Long id){
//		return new RateBean();
//	}
	
	@GetMapping("/searchRate/{rateId}")
	//@HystrixCommand(fallbackMethod = "fallbackretriveAllRateIds")
	public ResponseEntity<RateBean> searchRateById(@PathVariable Long rateId ){
		RateBean rateBean= rateService.searchRateById(rateId);
		
		if(rateBean.getRateId()== null)
			throw new RateIdNotFoundException("RateId not found in RMS");
		
		return new ResponseEntity<RateBean>(rateBean,HttpStatus.OK);
	}
	
	@PostMapping("/addRate")
	public ResponseEntity<Object> addRate(@RequestBody RateBean rate) {
		rateService.addOrUpdateRate(rate);
	return new ResponseEntity<Object>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updateRate")
	public void updateRate(@RequestBody RateBean rate) {
	 rateService.addOrUpdateRate(rate);
	
	}
	
	@DeleteMapping("deleteRate/{rateId}")
	public void deleteRateId(@PathVariable Long rateId ){
		
		RateBean rateBean= rateService.searchRateById(rateId);
		
		if(rateBean.getRateId()== null)
			throw new RateIdNotFoundException("RateId not found in RMS");
		
		rateService.deleteRateId(rateId);
	}

	
}
