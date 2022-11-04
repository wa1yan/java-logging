package com.waiyanhtet.demo.repo;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageRepo {
	
	//Logger logger = LoggerFactory.getLogger(MessageRepo.class);
	
	//private static final Logger LOGGER = LogManager.getLogger(MessageRepo.class);
	
	public void save() {
		
		log.info("Hello from message repo.");
	}

}
