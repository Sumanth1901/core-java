package com.xworkz.beans;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	@Value("Sangeetha")
	private String name;
	private int age;
	private String address;
	private LocalDate deathDate;
	@Value("5.8")
	private Double height;
	private Voice voice;
	private String Location;
	@Value("sheethal")
	private String SiblingName;
	private long phNo;
	private boolean isLegs;
	private String isDeathby;
	private boolean isMarried;
	private boolean isEducated;
	private int noOfMembers;
	private int friends;
	public boolean isAdharIssued;
	public String job;
	public boolean isHospitalized;
	public boolean isLongHairs;
	@Value("Brown")
	public String hairColor;
	public Boolean isGoodPerson;
	
	
	
	
	public Ghost(@Qualifier("gAge") int age,@Qualifier("gAddress") String address,@Qualifier("dDate") LocalDate deathDate,@Qualifier("voice") Voice voice,@Qualifier("phone") long phNo,@Qualifier("legs") boolean isLegs,
			boolean isMarried, boolean isEducated,@Qualifier("mem") int noOfMembers, @Qualifier("frnd") int friends, boolean isAdharIssued, String job,
			boolean isHospitalized, boolean isLongHairs, Boolean isGoodPerson) {
		super();
		this.age = age;
		this.address = address;
		this.deathDate = deathDate;
		//this.height = height;
		this.voice = voice;
		this.phNo = phNo;
		this.isLegs = isLegs;
		this.isMarried = isMarried;
		this.isEducated = isEducated;
		this.noOfMembers = noOfMembers;
		this.friends = friends;
		this.isAdharIssued = isAdharIssued;
		this.job = job;
		this.isHospitalized = isHospitalized;
		this.isLongHairs = isLongHairs;
		this.isGoodPerson = isGoodPerson;
	}


	@Autowired
	@Qualifier("loc")
	public void setLocation(String location) {
		Location = location;
	}
	
	
	@Value("bike")
	public void setIsDeathby(String isDeathby) {
		this.isDeathby = isDeathby;
	}


	@Override
	public String toString() {
		return "Ghost [name=" + name + ", age=" + age + ", address=" + address + ", deathDate=" + deathDate
				+ ", height=" + height + ", voice=" + voice + ", Location=" + Location + ", SiblingName=" + SiblingName
				+ ", phNo=" + phNo + ", isLegs=" + isLegs + ", isDeathby=" + isDeathby + ", isMarried=" + isMarried
				+ ", isEducated=" + isEducated + ", noOfMembers=" + noOfMembers + ", friends=" + friends
				+ ", isAdharIssued=" + isAdharIssued + ", job=" + job + ", isHospitalized=" + isHospitalized
				+ ", isLongHairs=" + isLongHairs + ", hairColor=" + hairColor + ", isGoodPerson=" + isGoodPerson + "]";
	}
	
	
	
	
	
	
	
	

}
