/**
 * 
 */
package com.durgasoft.springioc_12;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-ioc_12.xml");
		DAO dao = (DAO) context.getBean("dao");
		dao.showConnectionDetails();
		
		DAO mysqlDao = (DAO) context.getBean("mysqlDao");
		mysqlDao.showConnectionDetails();
		
	}

}
