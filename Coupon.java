package com;

import java.util.Scanner;

public class Coupon {

	public static void main(String[] args)
	{
		while(true)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the coupon code ");
			String str=s.next();


			char a[]= {'0','1','2','3','4','5','6','7','8','9'};
			
			char[] c=str.toCharArray();
			
			int w=c.length;
			
			int count=0;

			for (int i = 0; i < c.length; i++)
			{


				if(c.length<10 && c[0]>='A'&& c[0]<='Z' && c[1]>='A'&& c[1]<='Z')
				{

					for (int j = 2; j < c.length-1; j++)
					{

						for (int j2 = 0; j2 < a.length; j2++)
						{
							if(c[j]==a[j2])
							{
								count++;	

							}
						}
					}
				}


				if(count==6) 
				{
					if(c[w-1]>='A' && c[w-1]<='Z')
					{
						System.out.println("valid coupon "+str);
					}
					else
					{
						System.out.println("invalid coupon "+str );
					}
				}
				else
				{
					System.out.println("invalid coupon");
				}
				break;
			}
		}
	}
}
