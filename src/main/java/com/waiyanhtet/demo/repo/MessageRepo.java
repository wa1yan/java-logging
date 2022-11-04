package com.waiyanhtet.demo.repo;

import org.slf4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageRepo {
	
	Logger logger = LoggerFactory.getLogger(MessageRepo.class);
	
	//private static final Logger LOGGER = LogManager.getLogger(MessageRepo.class);
	
	public void save() {
		
		logger.debug("Hello from message repo.");
	}

}
