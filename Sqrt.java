package com;

public class Sqrt {

	public static double sqrt(int n)
	{
	double temp;
	double sqr=n/2;
	do {
		temp=sqr;
		sqr=(temp+(n/temp))/2;
		
	}
	while((temp-sqr)!=0);
	return sqr;
	
	}
	public static void main(String[] args) {
		
		int n=16;
		System.out.println(sqrt(n));
	}
	
	
	
}
