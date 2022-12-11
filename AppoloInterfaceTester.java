package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.apolo.AppoloHospital;
import com.xworkz.hospitalapp.patient.Gender;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.patient.AppoloImpl.AppoloImpli;


public class AppoloInterfaceTester {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		System.out.println("enter size");
		int size=s.nextInt();
		AppoloHospital ap=new AppoloImpli(size);
		
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
		
		System.out.println("enter patient name and newaddress to update the address");
		//System.out.println(ap.updateAdressByName(s.next(), s.next()));
		if(ap.updateAdressByName(s.next(), s.next()))
		{
			System.out.println("updated the data or address");
		}
		else
		{
			System.out.println("unable to fetch the details");
		}
		System.out.println("enter patient to delete");
		ap.deleteByName(s.next());
		ap.getnewPatient();
		
	}



	

}
