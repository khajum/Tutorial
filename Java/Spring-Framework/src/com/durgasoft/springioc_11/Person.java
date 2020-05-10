/**
 * 
 */
package com.durgasoft.springioc_11;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * @author i80779
 *
 */
public class Person {

	String name;
	String about;
	Vector fruits;
	TreeSet players;
	Hashtable technologies;
	
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
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(TreeSet players) {
		this.players = players;
	}

	/**
	 * @param technologies the technologies to set
	 */
	public void setTechnologies(Hashtable technologies) {
		this.technologies = technologies;
	}

	public void showDetails() {
		System.out.println("Person Details:\n Name:" + name + "\n About: "+about);
		System.out.println(name+" likes Fruits:\n "+fruits.toString());
		System.out.println("FIFA 2017 Best Players:\n "+players);
		System.out.println("Popular Technologies:\n "+technologies);
		
	}

}
