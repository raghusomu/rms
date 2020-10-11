package com.rms.utils;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator extends AbstractHealthIndicator{
	
	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		
		 builder.up()
         .withDetail("app", "Alive and Kicking")
         .withDetail("error", "Nothing! I'm good.");
		
	}

	
}
