package com.durgasoft.springioc_24;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc24.xml");
		CarInstanceFactory cf1 = (CarInstanceFactory) context.getBean("cf");
		CarInstanceFactory cf2 = (CarInstanceFactory) context.getBean("cf");
		System.out.println(cf1 == cf2);
		
		
		Calendar cal1 = (Calendar) context.getBean("calendar");
		String calendarType = cal1.getCalendarType();
		System.out.println(calendarType);
		
		Calendar cal2 = (Calendar) context.getBean("calendar");
		System.out.println(cal1 == cal2);
		
/*		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getCalendarType());
*/
		
	}

}
