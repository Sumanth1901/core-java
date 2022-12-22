package com.xworkz;


import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Dam {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		String name1="Bhavani Sagar";
		String name2="Tungabhadra";
		String name3="Rihand";
		String name4="Maithon";
		String name5="Koyna";
		String name6="Bisalpur";
		String name7="Mettur";
		String name8="Krishnarajasagar";
		String name9="Brp";
		String name10="Indira Sagar";
		String name11="Cheruthoni";
		String name12="Sardar Sarovar";
		String name13="Nagarjuna Saga";
		String name14="Hirakud";
		String name15="Bhakra Nangal";
		String name16="Tehri";
		String name17="Bhakra";
		String name18="Nagi";
		String name19="Lakshya";
		String name20="Idukki";
		String name21="Ranjith Sagar Dam";
		String name22="Pong";
		String name23="Chakra";
		String name24="Ramganga";
		String name25="Nagarjuna Sagar dam";
		String name26="Nagi";
		String name27="Bargi";
		String name28="Gandhi Sagar";
		String name29="rar";
		
		Collection<String>dam=new ArrayList<String>();
		dam.add(name1);
		dam.add(name2);
		dam.add(name3);
		dam.add(name4);
		dam.add(name5);
		dam.add(name6);
		dam.add(name7);
		dam.add(name8);
		dam.add(name9);
		dam.add(name10);
		dam.add(name11);
		dam.add(name12);
		dam.add(name13);
		dam.add(name14);
		dam.add(name15);
		dam.add(name16);
		dam.add(name17);
		dam.add(name18);
		dam.add(name19);
		dam.add(name20);
		dam.add(name21);
		dam.add(name22);
		dam.add(name23);
		dam.add(name24);
		dam.add(name25);
		dam.add(name26);
		dam.add(name27);
		dam.add(name28);
		dam.add(name29);
		System.out.println(dam);
		System.out.println("=========================");
		System.out.println("add all methode ");
		
		Collection<String> coll=new ArrayList();
		
		coll.addAll(dam);
		System.out.println(dam);
		
		System.out.println("==========STARTS WITH===============");
		
		Iterator<String> itr1=dam.iterator();
		while(itr1.hasNext())
		{
			String element=itr1.next();
			if(element.startsWith("T"))
			{
				System.out.println("Elements starts with T are " + element);
				
			}
		}
		System.out.println("=========================");
		System.out.println("===========ENDS WITH==============");
		
		Iterator<String> itr=dam.iterator();
		while(itr.hasNext())
		{
			String element=itr.next();
			if(element.endsWith("ra"))
			{
				System.out.println("Elements ends with ra are " + element);
				
			}
		}
		System.out.println("=========================");
		System.out.println("===========LENGTH EXCEEDING 15==============");
		Iterator<String> itr3=dam.iterator();
		while(itr3.hasNext())
		{
			String element=itr3.next();
			if(element.length()>=15)
			{
				System.out.println("length of dams " + element);
				
			}
		}
		System.out.println("=========================");
		System.out.println("===========REMOVE ELEMENT==============");
		Iterator<String> itr4=dam.iterator();
		while(itr4.hasNext())
		{
			String element=itr4.next();
			if(element.contains("p"))
			{
				System.out.println("remove element " + element);
				itr4.remove();
				System.out.println(dam);
				
			}
		}
		
		System.out.println("=========================");
		System.out.println("===========UPPER CASE==============");
		for(String element : dam)
		{
			
				System.out.println(element.toUpperCase());
			
		}
		System.out.println("=========================");
		System.out.println("===========LOWER CASE==============");
		for(String element : dam)
		{
			
				System.out.println(element.toLowerCase());
			
		}
		
		System.out.println("polindrome of dam");
		

		Iterator<String> itr5=dam.iterator();
		while(itr5.hasNext())
		{
			String rev="";
			String element=itr5.next();

			for(int i=element.length()-1 ; i>=0;i--)
			{
				rev=rev+element.toLowerCase().charAt(i);
			}
			System.out.println(rev);
		
			if(element.equals(rev))
			{
				System.out.println("========================");
				System.out.println("element is polindrome "+element);
			}
				
			}
	
			
		
	
		

	}

}
