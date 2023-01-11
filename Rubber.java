package com.xworkz.configuration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Rubber {
	
	@Autowired
	@Qualifier("Rubname")
	private String RubName;
	@Autowired
	private Type Rubtype;
	@Autowired
	private int Rubprice;
	@Autowired
	@Qualifier("Rubcolor")
	private String Rubcolor;
	@Autowired
	private String Rubshape;
	@Autowired
	private boolean Rubstolen;
	@Override
	public String toString() {
		return "Rubber [RubName=" + RubName + ", Rubtype=" + Rubtype + ", Rubprice=" + Rubprice + ", Rubcolor="
				+ Rubcolor + ", Rubshape=" + Rubshape + ", Rubstolen=" + Rubstolen + "]";
	}
	
	

}
