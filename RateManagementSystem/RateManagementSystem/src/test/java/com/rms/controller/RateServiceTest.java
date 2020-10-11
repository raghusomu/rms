package com.rms.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rms.repo.entity.RateEntity;
import com.rms.repository.RateRepository;

@RunWith(MockitoJUnitRunner.class)
public class RateServiceTest {

	@Mock
	RateRepository rateRepository;
	
	@Before
	public void init() {
		List<RateEntity> list= new ArrayList<>();
		RateEntity obj= new RateEntity();
		obj.setRateDescription("rateDescription");
		list.add(obj);
		when(rateRepository.findAll()).thenReturn(list);
	}
	
	@Test
	public void test() {
		
		System.out.println("testing checking   "+rateRepository.findAll());
	}

	
}
