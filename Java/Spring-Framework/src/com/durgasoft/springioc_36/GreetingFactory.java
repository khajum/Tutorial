package com.durgasoft.springioc_36;

public class GreetingFactory {
	private static String language;

	/**
	 * @param language the language to set
	 */
	public static void setLanguage(String language) {
		GreetingFactory.language = language;
	}
	
	public static Greeting getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Greeting greet = (Greeting) Class.forName(language).newInstance();
		return greet;
	}


}
