package com.xworkz.confi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan("com.xworkz")
public class Config {
	
	@Bean
	public String getString()
	{
		System.out.println("creating the string of get");
		return "hi";
	}

	@Bean
	public String cat()
	{
		System.out.println("creating the string of cat");
		String a="how are you";
		return a;
	}

	@Bean
	public String dog()
	{
		System.out.println("creating the string of dog");
		return "hello";
	}
	@Bean
	public String cow()
	{
		System.out.println("creating the string of cow");
		return "fine";
	}
	@Bean
	public String sheep()
	{
		System.out.println("creating the string of sheep");
		return "good";
	}
	@Bean
	public Double one()
	{
		System.out.println("one double");
		return 1.1;
	}
	@Bean
	public Double two()
	{
		System.out.println("two double");
		return 1.2;
	}
	@Bean
	public Double three()
	{
		System.out.println("three dopuble");
		return 1.3;
	}
	@Bean
	public Double four()
	{
		System.out.println("four double");
		return 1.4;
	}

	@Bean
	public Double five()
	{
		System.out.println("five dou");
		return 1.5;
	}
	
	@Bean
	public Boolean t1()
	{
		System.out.println("t1 bool");
		return true;
	}
	@Bean
	public Boolean t2()
	{
		System.out.println("t2 bool");
		return false;
	}
	@Bean
	public Boolean t3()
	{
		System.out.println("t3 bool");
		return true;
	}
	@Bean
	public Boolean t4()
	{
		System.out.println("t4 bool");
		return false;
	}
	@Bean
	public Boolean t5()
	{
		System.out.println("t5 bool");
		return true;
	}
	
	@Bean
	public StringBuffer buf()
	{
		System.out.println("buf 1");
		StringBuffer buf=new StringBuffer("buffer 1");
		return buf;
	}

	@Bean
	public StringBuffer buf2()
	{
		System.out.println("buf 2");
		StringBuffer buf2=new StringBuffer("buffer 2");
		return buf2;
	}

	@Bean
	public StringBuffer buf3()
	{
		System.out.println("buf 3");
		StringBuffer buf3=new StringBuffer("buffer 3");
		return buf3;
	}

	@Bean
	public StringBuffer buf4()
	{
		System.out.println("buf 4");
		StringBuffer buf4=new StringBuffer("buffer 4");
		return buf4;
	}

	@Bean
	public StringBuffer buf5()
	{
		System.out.println("buf 5");
		StringBuffer buf5=new StringBuffer("buff 5");
		return buf5;
	}
	
	@Bean
	public StringBuilder buld1()
	{
		System.out.println("buld 1");
		StringBuilder buld=new StringBuilder("buld 1");
		return buld;
	}
	@Bean
	public StringBuilder buld2()
	{
		System.out.println("buld 2");
		StringBuilder buld2=new StringBuilder("buld 2");
		return buld2;
	}
	@Bean
	public StringBuilder buld3()
	{
		System.out.println("buld 3");
		StringBuilder buld3=new StringBuilder("buld 3");
		return buld3;
	}
	@Bean
	public StringBuilder buld4()
	{
		System.out.println("buld 4");
		StringBuilder buld4=new StringBuilder("buld 4");
		return buld4;
	}
	@Bean
	public StringBuilder buld5()
	{
		System.out.println("buld 5");
		StringBuilder buld5=new StringBuilder("buld 5");
		return buld5;
	}
	@Bean
	public ArrayList arr1()
	{
		System.out.println("array list object created");
		ArrayList<Integer> arr=new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		return arr;
		
	}
	
	@Bean
	public Map hash()
	{
		
		System.out.println("hashmap object is crteated");
		HashMap<String,Integer> hs=new HashMap();
		
		hs.put("java", 1);
		hs.put("python", 2);
		hs.put("c", 3);
		hs.put("html", 4);
		hs.put("css", 5);
	
		return hs;
		
	}
}
