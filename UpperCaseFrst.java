package com;

public class UpperCaseFrst {

	public static void main(String[] args)
	{
		char b=0;
		char a = 0;
		String str="shimoga is of the smart city";
		char c[]=str.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(i==0 && c[i]>='a' && c[i]<='z')
			{
			
			a+= (char)(c[i]-32);
			c[i]=a;
			}

				if(c[i]==' ' && c[i+1]>='a' && c[i+1]<='z')
				{
					b=(char)(c[i+1]-32);
					
					c[i+1]=b;
				}
				
				
			
			
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			
		}
		
		

	}

}
