/**
 * 
 */
package com.durgasoft.springioc_07;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-ioc_07.xml");
		Person person = context.getBean("person",Person.class);
		person.showDetails();
	}

}
