package com.rms.controller;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rms.repo.entity.RateEntity;
import com.rms.repository.RateRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class RateRespoitoryTest {

	@Autowired
	RateRepository rateRepository;
	
	@Before
	public void init() {
		RateEntity entity= new RateEntity();
		entity.setAmount(100);
		entity.setRateId((long) 100);
		entity.setRateDescription("rateDescription");
		rateRepository.save(entity);
	}

	@Test
	public void test() {
		List<RateEntity> findAll = rateRepository.findAll();
		findAll.forEach(obj->{System.out.print(obj);});
		System.out.println("testing checking");
	}
	
	@Test
	 public void it_should_save_user()
	   {       
		Optional<RateEntity> entity= rateRepository.findById((long) 100);

		System.out.println("testing checking");
	   //assertThat(rateRepository.findById(entity.get()).get()).isEqualTo(user); 
	   }
}
