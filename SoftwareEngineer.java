package com.xworkz.configuration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("name")
	private String engname;
	@Autowired
	@Qualifier("slaray")
	private Double salary;
	
	@Autowired
	@Qualifier("cmpname")
	private String companyname;
	@Autowired
	private Integer expiriance;
	
	
	@Override
	public String toString() {
		return "SoftwareEngineer [engname=" + engname + ", salary=" + salary + ", companyname=" + companyname
				+ ", expiriance=" + expiriance + "]";
	}
	
	

}
