package com.xworkz;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeaponRunner {

	public static void main(String[] args) {
		
			WeaponDTO dto=new  WeaponDTO("A1-47","rings of lord","Metal",170000,Type.AK47);
			WeaponDTO dto1=new  WeaponDTO("Tanker","longer world","alluminum",1000,Type.M416);
			WeaponDTO dto2=new  WeaponDTO("Rocket Launcer","Wrold war","Platinum",176000,Type.MA47);
			WeaponDTO dto3=new  WeaponDTO("F16-weapon","lord of rings","Gold",350000,Type.AK47);
			WeaponDTO dto4=new  WeaponDTO("Panzer","Netflix","Tagad",10,Type.M416);
			
			
			Collection<WeaponDTO> dtos = Stream.of(dto,dto1,dto2,dto3,dto4).collect(Collectors.toSet());
			
			System.out.println("===Checking the Ascending order===");
			
			dtos.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e));
			
			
			 System.out.println(System.lineSeparator());
			 System.out.println("====weapons madeOn and madeBy====");
		    dtos.stream().forEach(e->System.out.println("Made By"+e.getMadeBy()+" "+"Made on"+e.getMadeOn()));
			
		    
		    System.out.println(System.lineSeparator());
		    System.out.println("====weapons by name sorted in descending====");
			dtos.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(e->System.out.println(e.getName()));
			
			
		    System.out.println(System.lineSeparator());
		    System.out.println("====weapons by price greater then====");
			dtos.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
			
			
		    System.out.println(System.lineSeparator());
		    System.out.println("===sortedBy madeOn=====");
			dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
			
			
		    System.out.println(System.lineSeparator());
		    System.out.println("====price ascending======");
		    dtos.stream().sorted((a1,a2)->Double.compare(a1.getPrice(),a2.getPrice())).forEach(e->System.out.println(e.getPrice()));
		    
		    
		    System.out.println(System.lineSeparator());
		    System.out.println("====price descending =====");
		    dtos.stream().sorted((a1,a2)->Double.compare(a2.getPrice(),a1.getPrice())).forEach(e->System.out.println(e.getPrice()));
		   
		    
		    System.out.println(System.lineSeparator());
		    System.out.println("====sort by madeOn and name asc order=====");
			dtos.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e.getName()));
			dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
			
			
			
		    System.out.println(System.lineSeparator());
		    System.out.println("=====sort by type and madeby, name desc order ========");
			dtos.stream().sorted((a1,a2)->a2.getType().compareTo(a1.getType())).forEach(e->System.out.println(e.getType()));
			dtos.stream().sorted((a1,a2)->a2.getMadeBy().compareTo(a2.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
				

	}

}
