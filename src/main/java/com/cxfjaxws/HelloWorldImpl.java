package com.cxfjaxws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldImpl implements HelloWorld {

	private final Logger logger = LoggerFactory.getLogger(HelloWorldImpl.class);

	public String sayHi(String name) {
		logger.info("##################");
		logger.info("Hi, " + (name != null ? name : "Guest"));
		logger.info("##################");
		return "Hi, " + (name != null ? name : "Guest");
	}
}
