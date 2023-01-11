package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.AutowiredConfiguration;
import com.xworkz.configuration.beans.Bullet;
import com.xworkz.configuration.beans.HardwareShop;
import com.xworkz.configuration.beans.Pencil;
import com.xworkz.configuration.beans.Rubber;
import com.xworkz.configuration.beans.Software;
import com.xworkz.configuration.beans.SoftwareEngineer;

public class Runner {

	public static void main(String[] args) {
		
		int count=0;
		
		ApplicationContext container=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		HardwareShop ref=container.getBean(HardwareShop.class);
		
		System.out.println(ref);
		
		System.out.println("=================");
		
		Software ref1=container.getBean(Software.class);
		System.out.println(ref1);
		
		System.out.println("==============");
		
		SoftwareEngineer ref2=container.getBean(SoftwareEngineer.class);
		System.out.println(ref2);
		
		System.out.println("======================");
		
		Pencil ref3=container.getBean(Pencil.class);
		System.out.println(ref3);
		
		System.out.println("====================");
		
		Rubber ref4=container.getBean(Rubber.class);
		System.out.println(ref4);
		
		System.out.println("======================");
		
		Bullet ref5=container.getBean(Bullet.class);
		System.out.println(ref5);

		
		System.out.println("============================");
		String arr[]=container.getBeanDefinitionNames();
		System.out.println(container.getBeanDefinitionCount());
		
		for (int i = 0; i < arr.length; i++) {
			count++;
			
		}
		System.out.println(count +" bjects with spring");
	}

}
