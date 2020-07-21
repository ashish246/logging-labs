package com.logback.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Head implements Runnable {

	static Logger logger = LoggerFactory.getLogger(Head.class);

	private String name;

	@Override
	public void run() {

		MDC.put("logFileName", getName());

		logger.debug("hello");

		// remember remove this
		MDC.remove("logFileName");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		ExecutorService threadPools = Executors.newFixedThreadPool(20);

		int count = 1;
		while (count <= 10) {
			Head head = new Head();
			head.setName("head-" + count);
			threadPools.execute(head);
			count++;
		}
	}

}