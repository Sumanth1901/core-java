package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Actor;
import com.xworkz.beans.Rocket;
import com.xworkz.beans.Season;
import com.xworkz.confii.ConfigClass;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext application=new AnnotationConfigApplicationContext(ConfigClass.class);

		System.out.println(Arrays.toString(application.getBeanDefinitionNames()));
		
		System.out.println("==============with class Rocket literals====");
		Rocket refOfRocket=application.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());

		System.out.println("+============Rocket with methode object with literals===============+");

		Rocket refOfRocket1=application.getBean("rocky",Rocket.class);
		System.out.println(refOfRocket1);

		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getName());
		System.out.println(refOfRocket1.getBudget());



		System.out.println("=======Actor class with constructor===========");

		Actor act=application.getBean("actor",Actor.class);
		System.out.println(act);
		System.out.println(act.getLang());
		System.out.println(act.getName());
		System.out.println(act.getAge());

		System.out.println("=========Actor constructor with methode object============");
		Actor act1=application.getBean("act",Actor.class);
		System.out.println(act1);
		System.out.println(act1.getLang());
		System.out.println(act1.getName());
		System.out.println(act1.getAge());

		System.out.println("=========Season setter with class file============");

		Season sea=application.getBean("season",Season.class);
		System.out.println(sea);
		System.out.println(sea.getName());
		System.out.println(sea.getStartingMon());
		System.out.println(sea.getDuration());

		System.out.println("=========Season setter with methode object============");

		Season sea1=application.getBean("sea",Season.class);
		System.out.println(sea1);
		System.out.println(sea1.getName());
		System.out.println(sea1.getStartingMon());
		System.out.println(sea1.getDuration());

	}

}
