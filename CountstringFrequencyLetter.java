package com;

import java.util.Scanner;

public class Countstring {

	public static void main(String[] args) {
		//int len ;
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		int count[]=new int[256];
		
		//len=str.length();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			count[ str.charAt(i)]++;
		}
		
		for(int i=0;i<256;i++)
		{
			if (count[i] != 0)   
			{  
			     
			System.out.println((char) i +  " --> " + count[i]);  
			}  
					
	}

}
}
