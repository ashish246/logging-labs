package com.appender.jdbc;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jJDBCExample {
	static Logger log = Logger.getLogger(Log4jJDBCExample.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("src/log4j.properties");

		log.debug("Sample debug message");
		log.info("Sample info message");
		log.error("Sample error message");
		log.fatal("Sample fatal message");
	}
}