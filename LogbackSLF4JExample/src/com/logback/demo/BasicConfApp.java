package com.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The simplest way to configure logback is by letting logback fall back to its
 * default configuration. Let us give a taste of how this is done in an
 * imaginary application called App.
 * 
 * Assuming the configuration files logback-test.xml or logback.xml are not
 * present, logback will default to invoking BasicConfigurator which will set up
 * a minimal configuration. This minimal configuration consists of a
 * ConsoleAppender attached to the root logger. The output is formatted using a
 * PatternLayoutEncoder set to the pattern %d{HH:mm:ss.SSS} [%thread] %-5level
 * %logger{36} – %msg%n. Moreover, by default the root logger is assigned the
 * DEBUG level.
 * 
 * @author Administrator
 *
 */
public class BasicConfApp {

	final static Logger logger = LoggerFactory.getLogger(BasicConfApp.class);

	public static void main(String[] args) {

		logger.info("Msg #1");

		logger.warn("Msg #2");
		logger.error("Msg #3");

		logger.debug("Msg #4");

	}
}