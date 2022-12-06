package com.xworkz;

import java.util.Scanner;

import com.xworkz.hasa.Appolo;
import com.xworkz.hasa.Patient;
import com.xworkz.hasa.constant.Gender;

public class AppoloTester {

	public static void main(String[] args) 
	{

		
		Scanner s=new Scanner(System.in);
		int n=0;
		System.out.println("enter size");
		int size=s.nextInt();
		Appolo ap=new Appolo(size);
		
		while(n<size)
		{
			Patient patient=new Patient();
			System.out.println("enter the patient name");
			patient.setName(s.next());
			System.out.println("enter the  patient age");
			patient.setAge(s.nextInt());
			System.out.println("enter the gender");
			patient.setGender(Gender.valueOf(s.next()));
			System.out.println("enter the patient address");
			patient.setAddress(s.next());
	
			ap.added(patient);
			n=n+1;
		}
		ap.getPatient();
		System.out.println("enter patient name to search");
		ap.getPatientByName(s.next());
		
		System.out.println("enter patient age to search");
		ap.getPatientByAge(s.nextInt());
		
		System.out.println("enter patient address to search");
		ap.getPatientByAddress(s.next());
		
		System.out.println("enter patient gender to search");
		ap.getPatientByGender(Gender.valueOf(s.next()));
		
		System.out.println("enter patient gender to search patient name");
		ap.getPatientNamebyGender(Gender.valueOf(s.next()));
		
		System.out.println("enter patient name to search patient gender");
		ap.getGenderByPatientName(s.next());
		
		
		
	}

}
