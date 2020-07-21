package com.slf4j.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * It uses:
 * 
 * slf4j-simple-1.7.12.jar 
 * 
 * Binding for Simple implementation, which outputs all
 * events to System.err. Only messages of level INFO and higher are printed.
 * This binding may be useful in the context of small applications.
 * 
 * @author Administrator
 *
 */
public class HelloWorld {

	static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	static Integer t;
	static Integer oldT;

	public static void setTemperature(Integer temperature) {

		oldT = t;
		t = temperature;

		logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

		if (temperature.intValue() > 50) {
			logger.info("Temperature has risen above 50 degrees.");
		}
	}

	public static void main(String[] args) {
		logger.info("Hello World");

		setTemperature(55);
	}
}