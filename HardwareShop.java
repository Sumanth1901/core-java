package com.xworkz.configuration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	
	@Autowired
	@Qualifier("idofHardware")
	private int id;
	@Autowired
	@Qualifier("shopName")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private int gstNo;
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;
	
	
	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	

}
