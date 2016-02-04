package com.jsf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.apache.catalina.tribes.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean
@ViewScoped
public class StudentThree extends Student implements Serializable{
	
	private static final Logger logger = LoggerFactory
			.getLogger(StudentThree.class);
	
	private String favouriteLanguage;
	private String[] favouriteLanguages;
	private List<String> favouriteLanguageOptions;

	@PostConstruct
	public void init() {
		logger.info("init() called...");
		// prepopulate initail values
		firstName = "Ram";
		lastName = "Limbu";
		favouriteLanguage = "Java";
		
		// List of programming languages for Radio button
		favouriteLanguageOptions = new ArrayList<String>();
		favouriteLanguageOptions.add("Java");
		favouriteLanguageOptions.add("C#");
		favouriteLanguageOptions.add("PHP");
		favouriteLanguageOptions.add("Ruby");
		
	}
	
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	public String[] getFavouriteLanguages() {
		logger.info("getFavouriteLanguages() Called"+Arrays.toString(this.favouriteLanguages));
		return favouriteLanguages;
	}

	public void setFavouriteLanguages(String[] favouriteLanguages) {
		logger.info("setFavouriteLanguages() Called"+Arrays.toString(favouriteLanguages));
		this.favouriteLanguages = favouriteLanguages;
	}

	public List<String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public void setFavouriteLanguageOptions(List<String> favouriteLanguageOptions) {
		this.favouriteLanguageOptions = favouriteLanguageOptions;
	}
	
	

}
