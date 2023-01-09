package com.xworkz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.confi.Config;
import com.xworkz.thing.Mask;

public class SpringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ref=new AnnotationConfigApplicationContext(Config.class);
		
		//System.out.println(ref.getBean(Mask.class));
		String ref1=ref.getBean("cat",String.class);
		System.out.println(ref1.hashCode());
		
		String ref2=ref.getBean("getString",String.class);
		System.out.println(ref2.hashCode());
		
		String ref3=ref.getBean("dog",String.class);
		System.out.println(ref3.hashCode());
		
		String ref4=ref.getBean("cow",String.class);
		System.out.println(ref4.hashCode());
		
		String ref5=ref.getBean("sheep",String.class);
		System.out.println(ref5.hashCode());
		
		System.out.println("========================");
		Double reff=ref.getBean("one",Double.class);
		System.out.println(reff.hashCode());
		
		Double reff2=ref.getBean("two",Double.class);
		System.out.println(reff2.hashCode());
		
		Double reff3=ref.getBean("three",Double.class);
		System.out.println(reff3.hashCode());
		
		Double reff4=ref.getBean("four",Double.class);
		System.out.println(reff4.hashCode());
		
		Double reff5=ref.getBean("five",Double.class);
		System.out.println(reff5.hashCode());
		
		System.out.println("===============================");
		Boolean bol=ref.getBean("t1",Boolean.class);
		System.out.println(bol.hashCode());
		
		Boolean bol2=ref.getBean("t2",Boolean.class);
		System.out.println(bol2.hashCode());
		
		Boolean bol3=ref.getBean("t3",Boolean.class);
		System.out.println(bol3.hashCode());
		
		Boolean bol4=ref.getBean("t4",Boolean.class);
		System.out.println(bol4.hashCode());
		
		Boolean bol5=ref.getBean("t5",Boolean.class);
		System.out.println(bol.hashCode());
		
		System.out.println("=====================");
		
		StringBuffer buf=ref.getBean("buf",StringBuffer.class);
		System.out.println(buf.hashCode());
		
		StringBuffer buf2=ref.getBean("buf2",StringBuffer.class);
		System.out.println(buf2.hashCode());
		
		StringBuffer buf3=ref.getBean("buf3",StringBuffer.class);
		System.out.println(buf3.hashCode());
		
		StringBuffer buf4=ref.getBean("buf4",StringBuffer.class);
		System.out.println(buf4.hashCode());
		
		StringBuffer buf5=ref.getBean("buf5",StringBuffer.class);
		System.out.println(buf5.hashCode());
		
		System.out.println("===========================");
		
		StringBuilder buld1=ref.getBean("buld1",StringBuilder.class);
		System.out.println(buld1.hashCode());
		
		StringBuilder buld2=ref.getBean("buld2",StringBuilder.class);
		System.out.println(buld2.hashCode());
		
		StringBuilder buld3=ref.getBean("buld3",StringBuilder.class);
		System.out.println(buld3.hashCode());
		
		StringBuilder buld4=ref.getBean("buld4",StringBuilder.class);
		System.out.println(buld4.hashCode());
		
		StringBuilder buld5=ref.getBean("buld5",StringBuilder.class);
		System.out.println(buld5.hashCode());
		
		System.out.println("=========Array list================");
		
		ArrayList arr1=ref.getBean("arr1",ArrayList.class);
		System.out.println(arr1.hashCode());
		
		System.out.println("================MAPING=======");
		
		Map map1=ref.getBean("hash",HashMap.class);
		System.out.println(map1.hashCode());
		
		String[] bean=ref.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		

	}

}
