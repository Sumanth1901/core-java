package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	
	@Value("101")
	private int id;
	private String name;
	private String ownerName;
	@Value("english")
	private String lang;
	private Double price;
	
	@Autowired
	public NewsPaper(@Qualifier("paperName") String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	@Value("5.6")
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}
	
	
	
	
	

}
