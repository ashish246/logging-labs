package com.util.logging.demo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTest {

	private final static Logger logger = Logger.getLogger(LoggerTest.class
			.getName());
	private static FileHandler fh = null;

	public static void init() {
		try {
			fh = new FileHandler("loggerExample.log", false);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		Logger l = Logger.getLogger("");
		fh.setFormatter(new SimpleFormatter());
		l.addHandler(fh);
		l.setLevel(Level.CONFIG);
	}

	public static void main(String[] args) {
		LoggerTest.init();

		logger.info("message 1");
		logger.fine("message 2");

		// wont be displayed as it is below Level.CONFIG
		logger.fine("message 3");

		LoggerTest2.thing();
	}
}