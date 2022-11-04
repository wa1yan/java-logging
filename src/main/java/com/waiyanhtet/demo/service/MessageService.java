package com.waiyanhtet.demo.service;

import org.slf4j.Logger;
/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.waiyanhtet.demo.repo.MessageRepo;

@Component
public class MessageService {

	Logger logger = LoggerFactory.getLogger(MessageService.class);
	
	//private static final Logger LOGGER = LogManager.getLogger(MessageService.class);
	
	@Autowired
	private MessageRepo messageRepo;
	
	public String getMessage() {
		
		String message = "Hello from service.";
		logger.debug(message);
		
		//call to message repo
		messageRepo.save();
		
		return message;
	}
}
