package com.xworkz.hasa;

import com.xworkz.hasa.constant.Gender;

public class Appolo extends Hospital {
	
	//boolean isPatientAdded;
	int index;
	Patient[] patients;
	
	public Appolo(int size)
	{
		patients=new Patient[size];
	}
	
	public boolean added(Patient patient)
	{
		boolean isPatientAdded=false;
	//	System.out.println("not added");
		if(patient != null)
		{
			System.out.println("adding");
			
			patients[index++]=patient;
			isPatientAdded=true;
		}
		return isPatientAdded;
	}
	
	public void getPatient()
	{
		for(int j=0 ; j < patients.length ; j++)
		{
			
			System.out.println(this.patients[j].getName());
			System.out.println(this.patients[j].getAge());
			System.out.println(this.patients[j].getGender());
			System.out.println(this.patients[j].getAddress());
			System.out.println("================================");
			
		}
	}
	public void getPatientByName(String name)
	{
		System.out.println("inside get patient name");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getName().equals(name))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}
			
		}
	}
	public void getPatientByAge(int age)
	{
		System.out.println("inside get patient age");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getAge()==age)
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}}
		
			
		}
		public void getPatientByAddress(String address)
		{
			System.out.println("inside get patient address");
			for (int i = 0; i < patients.length; i++) {
				
				if(patients[i].getAddress().equals(address))
				{
					System.out.println("patient found ");
					System.out.println(this.patients[i].getName());
					System.out.println(this.patients[i].getAge());
					System.out.println(this.patients[i].getGender());
					System.out.println(this.patients[i].getAddress());
				}
				
			}
		}
			public void getPatientByGender(Gender gender)
			{
				System.out.println("inside get gender  ");
				for (int i = 0; i < patients.length; i++) {
					
					if(patients[i].getGender().equals(gender))
					{
						System.out.println("patient found ");
						System.out.println(this.patients[i].getName());
						System.out.println(this.patients[i].getAge());
						System.out.println(this.patients[i].getGender());
						System.out.println(this.patients[i].getAddress());
					}}
					
				}
				public void getPatientNamebyGender(Gender gender)
				{
					System.out.println("inside get patient name by gender");
					for (int i = 0; i < patients.length; i++) {
						
						if(patients[i].getGender().equals(gender))
						{
							System.out.println("patient found ");
							System.out.println(this.patients[i].getName());
							
						}
					}
						
					}
					public void getGenderByPatientName(String name)
					{
						System.out.println("inside get gender by name ");
						for (int i = 0; i < patients.length; i++) {
							
							if(patients[i].getName().equals(name))
							{
								System.out.println("patient found ");
								System.out.println(this.patients[i].getGender());
								
							}
							
						}

}
}