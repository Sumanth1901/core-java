package com.xworkz.configuration.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	private String softname;
	@Autowired
	private Double softversion;
	@Autowired
	private String softdeveloper;
	@Autowired
	private LocalDate softdate;
	@Autowired
	private Boolean softfree;
	@Override
	public String toString() {
		return "Software [softname=" + softname + ", softversion=" + softversion + ", softdeveloper=" + softdeveloper
				+ ", softdate=" + softdate + ", softfree=" + softfree + "]";
	}
	
	
	
	
	
	
}
