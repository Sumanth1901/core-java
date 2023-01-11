package com.xworkz.configuration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Bullet {

	@Autowired
	private String bulCompany;
	@Autowired
	private int bulPrice;
	@Autowired
	private String bulColor;
	@Autowired
	private double speed;
	
	
	@Override
	public String toString() {
		return "Bullet [bulCompany=" + bulCompany + ", bulPrice=" + bulPrice + ", bulColor=" + bulColor + ", speed="
				+ speed + "]";
	}
	
	
	
	
}
