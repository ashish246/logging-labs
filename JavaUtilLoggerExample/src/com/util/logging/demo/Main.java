package com.util.logging.demo;

import java.util.logging.Logger;

/**
 * @author Administrator
 *
 */
public class Main {
	
	//private static Logger LOGGER = Logger.getLogger("Main");
	
	//without hardcoding teh class name
	private static final Logger LOGGER = Logger.getLogger(Thread
			.currentThread().getStackTrace()[0].getClassName());

	public static void main(String[] args) {
		LOGGER.info("Logging an INFO-level message");
	}
}