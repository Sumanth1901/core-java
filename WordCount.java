package com;

import java.util.Scanner;
public class WordCount {
	static int count=0;
	
	public static void word(String str,String d) {
		String str1=str.toLowerCase();
		String a[]=str1.split(" ");
		for (int i = 0; i < a.length; i++) {
			if(d.equals(a[i]))
			{
				count++;
				
			}	
		}	
		System.out.println(d+" "+count);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		System.out.println("enter word");
		String d=sc.nextLine();
		word(str,d);
		sc.close();
		
	}

}
