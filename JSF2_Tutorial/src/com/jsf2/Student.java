package com.jsf2;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="student")
public class Student {

	String firstName;
	String lastName;
	
	//create no-argument constructer
	public Student() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
