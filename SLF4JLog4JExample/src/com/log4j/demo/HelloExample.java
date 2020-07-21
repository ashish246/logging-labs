package com.log4j.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloExample {

	final static Logger logger = LoggerFactory.getLogger(HelloExample.class);

	public static void main(String[] args) {

		HelloExample obj = new HelloExample();
		obj.runMe("ashish");

	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.error("This is fatal : " + parameter);

	}

}
