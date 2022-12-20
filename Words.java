package com;

import java.util.Scanner;
public class Words {
	static int count=0;
	
	public static void word(String str,String v) {
		String str1=str.toLowerCase();
		String a[]=str1.split(" ");
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals(v))
			{
				count++;
				
			}	
		}	
		System.out.println(v+" "+count);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		
		String str=sc.nextLine();
		
	//	System.out.println("==================");
		
		//System.out.print("enter word");
		
		String v=sc.nextLine();
		word(str,v);
		sc.close();
		
	}

}
