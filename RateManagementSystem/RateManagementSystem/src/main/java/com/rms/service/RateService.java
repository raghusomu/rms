package com.rms.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rms.dto.RateBean;
import com.rms.repo.entity.RateEntity;
import com.rms.repository.RateRepository;

@Service
public class RateService {

	@Autowired
	RateRepository rateRepository;

	public List<RateBean> retriveAllRateIds() {

		List<RateBean> rateIds = new ArrayList<RateBean>();
		List<RateEntity> rateEntity = rateRepository.findAll();
		RestTemplate rt = new RestTemplate();

		try {
//			ResponseEntity<String> resp = rt.getForEntity(new URI("https://surcharge.free.beeceptor.com/surcharge"),
//					String.class);
//			String body = resp.getBody();
//
//			RateBean rb = new ObjectMapper().readValue(body, RateBean.class);
//
//			System.out.println("RateService.retriveAllRateIds()" + rb);

			for (RateEntity rateids : rateEntity) {
				RateBean bean = new RateBean();
				BeanUtils.copyProperties(rateids, bean);
				//bean.setSurchargeDescription(rb.getSurchargeDescription());
				//bean.setSurchargeRate(rb.getSurchargeRate());
				rateIds.add(bean);

			}
		} catch (RestClientException e) {
			e.printStackTrace();
		} 
			//catch (URISyntaxException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
			
		return rateIds;
	}
	
	public void addOrUpdateRate(RateBean rate) {
		
		RateEntity rateEntity = new RateEntity();
		BeanUtils.copyProperties(rate, rateEntity);
		rateRepository.save(rateEntity);
		
	}
	
	public RateBean searchRateById(Long id) {
		
		RateBean rateBean =  new RateBean();
		Optional<RateEntity> rateId =rateRepository.findById(id);
		//RestTemplate rt = new RestTemplate();
		try {
//			ResponseEntity<String> resp = rt.getForEntity(new URI("https://surcharge.free.beeceptor.com/surcharge"),
//					String.class);
//			String body = resp.getBody();
//
//			RateBean rb = new ObjectMapper().readValue(body, RateBean.class);
//
//			System.out.println("RateService.searchRateById()" + rb);

				BeanUtils.copyProperties(rateId.isPresent()?rateId.get():rateBean, rateBean);
				//rateBean.setSurchargeDescription(rb.getSurchargeDescription());
				//rateBean.setSurchargeRate(rb.getSurchargeRate());
			
		} catch (RestClientException e) {
			e.printStackTrace();
		} 
//		catch (URISyntaxException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

		return rateBean;
		
	}
	public void deleteRateId(Long id) {
		rateRepository.deleteById(id);
		
	}
	
}
