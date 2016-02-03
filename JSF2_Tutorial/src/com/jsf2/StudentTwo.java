package com.jsf2;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean
public class StudentTwo{
	
	private static final Logger logger = LoggerFactory
			.getLogger(StudentTwo.class);
	
	private String firstName;
	private String lastName;
	private String country;
	
	// list of countries for the drop-down list
	//private List<String> countryOptions;
	private Map<String,String> countryOptions;
	
	//Public no-argument constructor
	public StudentTwo() {
		logger.info("StudentTwo() Constructer called.."); 
		
		//populate the list of countries
		
		//implementation using List
/*		countryOptions = new ArrayList<String>();
		countryOptions.add("Brazil");
		countryOptions.add("Nepal");
		countryOptions.add("India");
		countryOptions.add("Japan");
		countryOptions.add("Turkye");
		countryOptions.add("United States");*/
		
		//implementation using Map
		countryOptions = new HashMap<String, String>();
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("Nepal", "nepal");
		countryOptions.put("India", "India");
		countryOptions.put("Japan", "Japan");
		countryOptions.put("Turkye", "Turkye");
		countryOptions.put("France", "France");
		countryOptions.put("United States", "United States");
	}

	//getter/setter methods
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

/*	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	*/
}
