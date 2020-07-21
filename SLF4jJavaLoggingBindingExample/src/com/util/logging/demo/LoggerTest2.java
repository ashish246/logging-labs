package com.util.logging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerTest2 {
	private final static Logger logger = LoggerFactory.getLogger(LoggerTest.class
			.getName());

	public static void thing() {
		logger.warn("something to log");
	}
}
