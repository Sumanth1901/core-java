package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfig;
import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.MisileDTO;
import com.xworkz.dto.ResortDTO;
import com.xworkz.dto.SoldierDTO;
import com.xworkz.repo.SoldierImpl;
import com.xworkz.repo.SoldierRepo;
import com.xworkz.service.First;
import com.xworkz.service.FirstService;
import com.xworkz.service.MisileServ;
import com.xworkz.service.MisileServImpl;
import com.xworkz.service.Resort;
import com.xworkz.service.ResortServImpl;
import com.xworkz.service.SoldierServiceImple;

public class SoldierRunner {
	public static void main(String[] args) {

		SoldierDTO dto=new SoldierDTO("Sujan", 1, "second", "karnataka");

		SoldierServiceImple serv=new SoldierServiceImple();
		SoldierRepo repo=new SoldierImpl();
		serv.setRepo(repo);

		serv.validateAndSave(dto);

		System.out.println("====================");

		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfig.class);

		First saved=container.getBean(FirstService.class);

		FirstAidDTO dtoo=new FirstAidDTO();

		boolean save=saved.validateAndSave(dtoo);

		System.out.println("saveing "+save);

		System.out.println("====================");

		Resort saveing=container.getBean(ResortServImpl.class);

		ResortDTO dtooo=new ResortDTO();

		boolean savee=saveing.validateAndSave(dtooo);

		System.out.println("saveing "+savee);
		
		System.out.println("====================");

		MisileServ saveingg=container.getBean(MisileServImpl.class);

		MisileDTO dtoooo=new MisileDTO();

		boolean saveee=saveingg.validateAndSave(dtoooo);

		System.out.println("saveing "+saveee);
	
}

}
