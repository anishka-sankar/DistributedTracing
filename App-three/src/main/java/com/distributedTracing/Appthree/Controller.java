package com.distributedTracing.Appthree;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController
public class Controller {
	
	private static final Logger log=LoggerFactory.getLogger(Controller.class);
		
	@GetMapping("/appThree")
	public String get() {
		log.info("Welcome to Service 3");
		return "Done3";
	}
}
