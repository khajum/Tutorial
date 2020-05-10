/**
 * 
 */
package com.durgasoft.springioc_08;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author i80779
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-ioc_08.xml");
		//BeanFactory context = new XmlBeanFactory(new FileSystemResource("/resources/spring-ioc_08.xml"));
		Person person = (Person) context.getBean("person");
		person.showDetails();
		
	}

}
