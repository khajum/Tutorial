/**
 * 
 */
package com.durgasoft.springioc_08;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author i80779
 *
 */
public class Person {

	String name;
	String about;
	List fruits;
	Set players;
	Map	technologies;
	
	public Person() {
		System.out.println("Person Object Created.");
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
	 * @param fruits the fruits to set
	 */
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Set players) {
		this.players = players;
	}

	/**
	 * @param technologies the technologies to set
	 */
	public void setTechnologies(Map technologies) {
		this.technologies = technologies;
	}

	public void showDetails() {
		System.out.println("Person Details:\n Name:" + name + "\n About: "+about);
		System.out.println(name+" likes Fruits:\n "+fruits.toString());
		System.out.println("FIFA 2017 Best Players:\n "+players);
		System.out.println("Popular Technologies:\n "+technologies);
		
	}

}
