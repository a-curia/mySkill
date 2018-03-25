package com.dbbyte.myskill.ontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	private final String className = this.getClass().getSimpleName();
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value= {"/",""}, method=RequestMethod.GET)	
	public String getIndex() {
		
		logger.info( className + "> Application started!");
		
		return "Index Controller";
	}
}
