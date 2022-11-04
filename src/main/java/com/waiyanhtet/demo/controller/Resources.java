package com.waiyanhtet.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waiyanhtet.demo.service.MessageService;

@RestController
@RequestMapping("/api/v1")
public class Resources {

	@Autowired
	private MessageService messageService;
	Logger logger = LoggerFactory.getLogger(Resources.class);

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		logger.debug("Hello from resources.");
		return new ResponseEntity<String>(messageService.getMessage(), HttpStatus.CREATED);
	}

}
