package com.xworkz.configuration;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.Type;
import com.xworkz.beans.Voice;

@Configuration
@ComponentScan("com.xworkz")
public class AssignmentConfig {
	
	@Bean
	public String paperName()
	{
		//System.out.println("registering paper name");
		return "Indian Express";
	}
	
	@Bean
	public String ownerName()
	{
		//System.out.println("registering owner name");
		return "Sangeetha";
	}
	
	//===========================

	@Bean
	public String sName()
	{
		//System.out.println("registering sname with spring");
		return "black cobra";
	}
	
	@Bean
	public String type()
	{
		//System.out.println("registering type with spring");
		return "female";
	}
	
	@Bean
	public Boolean poision()
	{
		
		return true;
	}
	
	//==================
	
	@Bean
	public String engName()
	{
		return "german";
	}
	
	@Bean
	public Type etype()
	{
		return Type.big;
	}
	
	@Bean
	public String ecompany()
	{
		return "polo";
	}
	
	@Bean
	public String stroke()
	{
		return "no stroke";
	}
	
	//======================================
	

	@Bean
	public String loc()
	{
		return "shimoga";
	}
	
	@Bean
	public Integer gAge()
	{
		return 24;
	}
	
	@Bean
	public String gAddress()
	{
		return "gajnur";
	}
	
	@Bean
	public LocalDate dDate()
	{
		return LocalDate.of(2023, 01, 10);
		
	}
	
	@Bean
	public Voice voice()
	{
		return Voice.high;
	}
	
	@Bean
	public Boolean legs()
	{
		return true;
	}
	
	@Bean
	public Long phone()
	{
		return 9110807076L;
	}
	
	@Bean
	public Boolean isMarried()
	{
		return false;
	}
	
	@Bean
	public Boolean isEducated()
	{
		return true;
	}
	
	@Bean
	public Integer mem()
	{
		return 4;
	}
	
	@Bean
	public Integer frnd()
	{
		return 125;
	}
	
	
	
	@Bean
	public Boolean isAdharIssued()
	{
		return true;
	}
	
	@Bean
	public String job()
	{
		return "student";
	}
	
	@Bean
	public Boolean isHospitalized()
	{
		return false;
	}
	
	@Bean
	public Boolean isLongHairs()
	{
		return false;
	}
	
	@Bean
	public Boolean isGoodPerson()
	{
		return true;
	}
	
	
	
	
	
	
	
	
	
}
