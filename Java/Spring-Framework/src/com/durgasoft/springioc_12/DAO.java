package com.durgasoft.springioc_12;

import org.springframework.beans.factory.annotation.Required;

public class DAO {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public DAO() {
		System.out.println("DAO Object created.");
	}
	/**
	 * @param driver the driver to set
	 */
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	/**
	 * @param url the url to set
	 */
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void showConnectionDetails() {
		System.out.println("Connection Properties:");
		System.out.println("\t Driver: "+driver+"\n\t Url: "+url+"\n\t User: "+user+"\n\t Password: "+password);
	}

}
