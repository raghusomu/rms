package com.rms.utils;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.apache.logging.log4j.Logger;

public class Log4j2Application implements ApplicationRunner {

	   private static final Logger logger = LogManager.getLogger(Log4j2Application.class);

	    @Override
	    public void run(ApplicationArguments applicationArguments) throws Exception {
	        logger.debug("Debugging log");
	        logger.info("Info log");
	        logger.warn("Hey, This is a warning!");
	        logger.error("Oops! We have an Error. OK");
	        logger.fatal("Damn! Fatal error. Please fix me.");
	    }
	}

