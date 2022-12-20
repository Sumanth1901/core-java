package com;

import java.util.Scanner;

public class Absolute {
	static int p=0;
	static int r=0;
	static int q=0;
	static int abss_p=0;
	static int abs_q=0;
	
	static void abs(int n)
	{
		
			
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				r += i;
				q=r*r;
				
				p += i*i;			
				
		}
		}
		
		System.out.println(p);
		System.out.println(q);
		
		System.out.println(" after absolute");
		
//		int abs_p=(p<0) ? -p : p;
//		
//		int abs_q=(q<0) ? -q : q;
		
		if(p<0 || q<0)
		{
			 p=p*-1;
			 q=q*-1;
		}
		
		System.out.println(p);
		System.out.println(q);
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		
		abs(n);
	}

}
