package com.xworkz.boot;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.repo.SoldierImpl;
import com.xworkz.repo.SoldierRepo;
import com.xworkz.service.SoldierService;
import com.xworkz.service.SoldierServiceImple;

public class SoldierRunner {
	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO("Sujan", 1, "second", "karnataka");
		
		SoldierServiceImple serv=new SoldierServiceImple();
		SoldierRepo repo=new SoldierImpl();
		serv.setRepo(repo);
		
		serv.validateAndSave(dto);
	}

}
