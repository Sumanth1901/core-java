package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private Integer duration;
	private String startingMon;
	
	public Season() {
	System.out.println("creating season with spring");	// TODO Auto-generated constructor stub
	}

	@Value("4")
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	@Value("winter")
	public void setName(String name) {
		this.name = name;
	}
	@Value("nov")
	public void setStartingMon(String startingMon) {
		this.startingMon = startingMon;
	}
	
	public Integer getDuration() {
		return duration;
	}
	public String getStartingMon() {
		return startingMon;
	}
	public String getName() {
		return name;
	}
}
