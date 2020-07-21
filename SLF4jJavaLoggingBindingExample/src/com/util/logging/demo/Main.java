package com.util.logging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Now the configuration for JDK logging is a bit difficult to work with. Not
 * only need a config file, such assrc/main/resources/logging.properties, but
 * you would also need to add a System properties
 * -Djava.util.logging.config.file=logging.properties in order to have it pick it
 * up.
 * 
 * @author Administrator
 *
 */
public class Main {

	// private static Logger LOGGER = Logger.getLogger("Main");

	// without hardcoding teh class name
	private static final Logger LOGGER = LoggerFactory.getLogger(Thread
			.currentThread().getStackTrace()[0].getClassName());

	public static void main(String[] args) {
		LOGGER.info("Logging an INFO-level message");
	}
}