package com;

public class StringRotation {
	
	public static boolean rotation(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		String st3=str1+str1;
		
		if(st3.contains(str2))
		{
			return true;
		}
		return false;
	
		
	}
	public static void main(String[] args) {
		
		String str1="sumsang";
		String str2="sumsang";
		
		if(rotation(str1,str2))
		{
			System.out.println("rotation is "+rotation(str1,str2));
		}
		else
		{
			System.out.println("not rotation");
		}
	}
	


}
