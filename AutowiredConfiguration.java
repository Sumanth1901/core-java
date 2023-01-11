package com.xworkz.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.configuration.beans.Type;

@Configuration
@ComponentScan("com.xworkz")
public class AutowiredConfiguration {
	
	@Bean
	public Integer idofHardware()
	{
		int id=201;
		return id;
	}
	
	@Bean
	public String shopName()
	{
		return "sri gurubasaveshwara traders";
	}
	
	@Bean
	public String owner()
	{
		return "Shashidhar";
	}
	
	@Bean
	public String address()
	{
		return "gajnur";
	}
	
	@Bean
	public Integer gstNo()
	{
		int gstNo=1254621;
		return gstNo;
	}
//=================================	
	@Bean
	public String softname()
	{
		return "teamviewer";
	}
	
	@Bean
	public String softdeveloper()
	{
		return "connection of softwares";
	}
	
	@Bean
	public Double softversion()
	{
		Double softversion=2.8;
		return softversion;
	}
	@Bean
	public Boolean softfree()
	{
		return true;
	}
	
	@Bean
	public LocalDate softdate()
	{
		return LocalDate.of(2012, 03, 21);
	}
	
	
	//------------------------------

	@Bean
	public Double slaray()
	{
		Double salary=25500.0;
		return salary;
	}
	
	@Bean
	public String name()
	{
		return "Sangeeth";
	}
	
	@Bean
	public String cmpname()
	{
		return "gajnur";
	}
	
	@Bean
	public Integer expiriance()
	{
		int expiriance=5;
		return expiriance;
	}
	
	//====================
	
	@Bean
	public String pencilName()
	{
		return "doms";
	}
	@Bean
	public Type pentype()
	{
		return Type.penpencil;
	}
	@Bean
	public Integer penprice()
	{
		int price=20;
		return price;
	}
	
	@Bean
	public String color()
	{
		return "pink";
	}
	@Bean
	public Boolean pensharp()
	{
		return true;
	}
	@Bean
	public Boolean penstolen()
	{
		return false;
	}
	
	//==================
	@Bean
	public String Rubname()
	{
		return "apsara";
	}
	@Bean
	public Type Rubtype()
	{
		return Type.graphite;
	}
	@Bean
	public Integer Rubprice()
	{
		int price=15;
		return price;
	}
	
	@Bean
	public String Rubcolor()
	{
		return "white";
	}
	@Bean
	public String Rubshape()
	{
		return "square";
	}
	@Bean
	public Boolean Rubstolen()
	{
		return false;
	}
	//===========================
	@Bean
	public String bulCompany()
	{
		return "royal enfield";
		
	}
	@Bean
	public Double speed()
	{
		Double speed=125.4;
		return speed;
	}
	@Bean
	public Integer bulPrice()
	{
		int bulPrice=200000;
		return bulPrice;
	}
	@Bean
	public String bulColor()
	{
		return "Red";
		
	}
}
