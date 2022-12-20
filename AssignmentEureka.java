package com;

import java.util.Scanner;

public class AssignmentEureka {
	static int j;
	static int ival=0;
	
	static int a=0;
	static int[] b=new int[100];
	static int temp;
	
	static void sum(int r1,int r2) {
		
		for(int i=r1;i<=r2;i++)
		{
			int count=0;
			int len=0;
			int res=0;
			temp=i;
			ival=i;
			a=i;
			
			while(a!=0)
			{
				count++;
				a=a/10;
			}
			len=count;
			
			
			while(ival!=0)
			{
				int rem=ival%10;
				res=res+ (int)Math.pow(rem, len);
				ival=ival/10;
				len--;				
			}
			
			
			if(temp==res)
			{
				//System.out.print(" "+res);
				
				b[j++]=res;

			}	
			
			}			
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting range");
		int r1=sc.nextInt();
		System.out.println("enter sec range");
		int r2=sc.nextInt();
		
		sum(r1,r2);
		for (int i = 0; i < b.length; i++) {
			if(b[i]!=0) {
			
			System.out.print(b[i]+" ");
			}
		}

				
	}

}
