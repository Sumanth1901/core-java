package com;

public class Demo {
	
	int a[]= {3,10,4};
	
	 void dou()
	{
	
	for(int i=0;i<a.length;i++) {
		int b=a[i]+a[i];
		
		int r[]=new int[1];
		for(int j=0;j<r.length;j++)
			
		{
			r[j]=b;
			System.out.print(" "+r[j]);
		}
		
	}
	}

	public static void main(String[] args) {
		
		Demo d= new Demo();
		d.dou();
		// TODO Auto-generated method stub

	}

}
