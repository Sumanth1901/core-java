package com;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="lov ";
		String str2="you ";
		
		String c=str1+str2;
		System.out.println("befor swapping ");
		System.out.println(c);
		
		str2=c.substring(0,str1.length());
		str1=c.substring(str2.length());
		 c=str1+str2;
		
		System.out.println("after swapping");
		System.out.println(c);
		
		
		
		
	}

}
