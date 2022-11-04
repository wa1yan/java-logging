package com.waiyanhtet.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.waiyanhtet.demo.repo.MessageRepo;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageService {

	
	//private static final Logger LOGGER = LogManager.getLogger(MessageService.class);
	
	@Autowired
	private MessageRepo messageRepo;
	
	public String getMessage() {
		
		String message = "Hello from service.";
		log.info(message);
		
		//call to message repo
		messageRepo.save();
		
		return message;
	}
}
