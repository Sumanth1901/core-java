package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Value("india")
	private String country;
	
	@Value("ArayaBhata")
	private String name;
	
	@Value("3000000.0")
	private Double Budget;
	
	public Rocket() {
		System.out.println("creating aobject of Rocket with spring");
	}
	
	public Double getBudget() {
		return Budget;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}

}
