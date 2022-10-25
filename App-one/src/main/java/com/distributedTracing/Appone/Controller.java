package com.distributedTracing.Appone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private static final Logger log=LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private Proxy proxy;
	
	@GetMapping("/appOne")
	public String get() {
		log.info("Welcome to Service 1");
		String value = proxy.get();
		log.info("Back to Service 1, data is {}", value);
		return "Done1";
	}
}
