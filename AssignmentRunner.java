package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Engine;
import com.xworkz.beans.Ghost;
import com.xworkz.beans.NewsPaper;
import com.xworkz.beans.Snake;
import com.xworkz.configuration.AssignmentConfig;

public class AssignmentRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(AssignmentConfig.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		NewsPaper ref=container.getBean(NewsPaper.class);

		System.out.println(ref);

		System.out.println("====================");

		Snake ref1=container.getBean(Snake.class);

		System.out.println(ref1);
		
		System.out.println("===========================");
		
		Engine ref2=container.getBean(Engine.class);

		System.out.println(ref2);
		
		System.out.println("=================");
		
		Ghost ref3=container.getBean(Ghost.class);

		System.out.println(ref3);
	}

}
