package com.xworkz.hospitalapp.apolo;

import com.xworkz.hospitalapp.patient.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public interface AppoloHospital {
	
	
	public boolean added(Patient patient);
	public void getPatient();
	public void getPatientByName(String name);
	public void getPatientByAge(int age);
	public void getPatientByAddress(String address);
	public void getPatientByGender(Gender gender);
	public void getPatientNamebyGender(Gender gender);
	public void getGenderByPatientName(String name);
	public boolean updateAdressByName(String name,String newaddress);
	public boolean deleteByName(String name);
	public void getnewPatient();
	

}
