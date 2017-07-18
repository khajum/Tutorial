package com.ram.factorypattern;

public class LoggerFactory {
	public Logger getLogger(String loggerType) {
		if (loggerType == null) {
			return null;
		}
		
		if(loggerType.equalsIgnoreCase("Log4j")) {
			return new Log4jLogger();
		} else if(loggerType.equalsIgnoreCase("logback")) {
			return new LogBackLogger();
		} else if (loggerType.equalsIgnoreCase("java-util")) {
			return new JavaUtilLogger();
		}
		
		return null;
	}

}
