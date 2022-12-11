package com.xworkz.hospitalapp.patient.AppoloImpl;


import com.xworkz.hospitalapp.apolo.AppoloHospital;
import com.xworkz.hospitalapp.patient.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class AppoloImpli implements AppoloHospital  {
	int index;
	Patient[] patients;
	Patient newPatients[];
	
	public AppoloImpli(int size)
	{
		patients=new Patient[size];
	}
	
	@Override
	public boolean added(Patient patient) {
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
	@Override
	public void getPatient() {
		for(int j=0 ; j < patients.length ; j++)
		{
			
			System.out.println(this.patients[j].getName());
			System.out.println(this.patients[j].getAge());
			System.out.println(this.patients[j].getGender());
			System.out.println(this.patients[j].getAddress());
			System.out.println("================================");
			
		}
		
	}
	@Override
	public void getPatientByName(String name) {
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
	@Override
	public void getPatientByAge(int age) {
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
	@Override
	public void getPatientByAddress(String address) {
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
	@Override
	public void getPatientByGender(Gender gender) {

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
	
	@Override
	public void getPatientNamebyGender(Gender gender) {
		System.out.println("inside get patient name by gender");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getGender().equals(gender))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				
			}
		}
		
	}
	@Override
	public void getGenderByPatientName(String name) {
		System.out.println("inside get gender by name ");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getName().equals(name))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getGender());
				
			}}
		
	}
	@Override
	public boolean updateAdressByName(String name, String newaddress) {
		boolean isupdate=false;
		
		System.out.println("inside update address ");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getName().equals(name))
			{
				System.out.println("patient found ");
				patients[i].setAddress(newaddress);
				isupdate=true;
				
			}}
		return isupdate;
	}
	@Override
	public boolean deleteByName(String name) {
		boolean isDelete=false;
		
		System.out.println("inside delete name ");
		 newPatients=new Patient[patients.length-1];
		
		for (int i = 0,k=0; i < patients.length; i++) {
			
			if(!patients[i].getName().equals(name))
			{
				System.out.println("patient found ");
				newPatients[k++]=patients[i];
				isDelete=true;
				
			}
			
	}
		return isDelete;
	}

	@Override
	public void getnewPatient() {
		// TODO Auto-generated method stub
		for(int j=0 ; j < newPatients.length ; j++)
		{
			
			System.out.println(this.patients[j].getName());
			System.out.println(this.patients[j].getAge());
			System.out.println(this.patients[j].getGender());
			System.out.println(this.patients[j].getAddress());
			System.out.println("================================");
			
		}
		
	}
}
