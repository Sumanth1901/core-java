package com;

public class Unique {

	public static void main(String[] args) {
		
		int c=0;
		
		String str="Unmua";
		String str1=str.toLowerCase();
		
		for (int i = 0; i < str1.length(); i++) {
			
			for (int j = i+1; j < str1.length(); j++) {
				
				if(str1.charAt(i)==str1.charAt(j))
				{
					c++;
					break;
				}
				
			}
			
		}
		
		if(c>=1)
		{
			System.out.println("not unique");
		}
		else
		{
			System.out.println("unique");
		}
			

	}

}
