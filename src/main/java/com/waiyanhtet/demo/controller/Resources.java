package com.waiyanhtet.demo.controller;

//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waiyanhtet.demo.service.MessageService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class Resources {

	@Autowired
	private MessageService messageService;
	//Logger logger = LoggerFactory.getLogger(Resources.class);
	
	//private static final Logger LOGGER = LogManager.getLogger(Resources.class);

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		log.info("Hello from resources.");
		return new ResponseEntity<String>(messageService.getMessage(), HttpStatus.CREATED);
	}

}
