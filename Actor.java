package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	private String name;
	private String lang;
	private Integer age;
	
	
	public Actor(@Value("yash") String name,@Value("kannada") String lang,@Value("35") Integer age) {
		super();
		this.name = name;
		this.lang = lang;
		this.age = age;
	}
	
	public Integer getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getLang() {
		return lang;
	}
	
	

}
