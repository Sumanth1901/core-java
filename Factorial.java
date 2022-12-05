package search;

import java.util.Scanner;

public class Factorial {
static int mul=1;
	
	//int n=5;

	public static int multiply(int fac)
	{
	
			
			for(int i=1;i<=fac;i++)
			{
				mul=mul*i;
				
				
			}
			return mul;
			
			//System.out.println(mul);
	}
	

	public static void main(String[] args) {
		
		
		
		//int fac=factorial(n);
		//System.out.println(FactTester.multiply(2));
		int f=FactTester.multiply(5);
		
		System.out.println(f);

	
}
}