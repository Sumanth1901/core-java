package com.xworkz.hasa;

import com.xworkz.hasa.constant.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient
{
	
	private String name;
	private String address;
	private Gender gender;
	private int age;
	
//	public Patient(String name, String address, String gender,int age) 
//	{
//		this.name = name;
//		this.address = address;
//		this.gender = gender;
//		this.age=age;
//	}
//	
	public void disp() {
		
		System.out.println("name is :"+name+" address is "+address+" gender of patient is "+gender);
		System.out.println("age is "+age);
	}
	

}
