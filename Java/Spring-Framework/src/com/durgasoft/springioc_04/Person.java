/**
 * 
 */
package com.durgasoft.springioc_04;

/**
 * @author i80779
 *
 */
public class Person {

	String name;
	String about;
	String gender;
	int age;

	public Person() {
		System.out.println("Person Object Created.");
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Person(String name, String about, String gender, int age) {
		this.name = name;
		this.about = about;
		this.gender = gender;
		this.age = age;
	}
	
	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public void showDetails() {
		System.out.println("Person Details:\n Name:" + name + "\n About: "+about+"\n Gender: "
				+ gender + "\n Age:" + age);
	}

}
