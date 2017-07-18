package com.ram.DataAccessObjectPattern;

public class Student {
	private String name;
	private int rollNo;
	
	public Student(String name, int rn) {
		this.name = name;
		this.rollNo = rn;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
		
}
