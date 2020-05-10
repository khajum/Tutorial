package com.durgasoft.springioc_28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDeclarative {

	private String driver, url,username,password;
	Connection conn = null;
	
	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	public void myInit() throws Exception {
		System.out.println("myInit method is called.");
		Class.forName(driver);
		conn = DriverManager.getConnection(url,username,password);
		System.out.println("Connection opened.");
	}


	public void myDestroy() throws Exception {
		System.out.println("myDestroy method callded.");
		conn.close();
	}
	
	public void save(int id, String name, String email, String address) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, address);
		
		ps.executeUpdate();
		System.out.println("User saved.");
	}

}
