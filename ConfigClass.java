package com.xworkz.confii;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.Actor;
import com.xworkz.beans.Rocket;
import com.xworkz.beans.Season;

@Configuration
@ComponentScan("com.xworkz")
public class ConfigClass {
	
	
	@Bean
	public Rocket rocky()
	{
		System.out.println("registering rocky methode object with spring");
		Rocket roc=new Rocket();
		return roc;
	}
	
	@Bean
	public Actor act()
	{
		System.out.println("registering Actor methode object with spring");
		Actor acting=new Actor("sudeep", "kannada", 40);
		return acting;
	}
	@Bean
	public Season sea()
	{
		System.out.println("registering rocky methode object with spring");
		Season season=new Season(); 
		season.setDuration(4);
		season.setName("rain");
		season.setStartingMon("june");
		return season;
	}

}
