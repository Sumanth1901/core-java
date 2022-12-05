package com;

public class PolindrumNumber {

	public static void main(String[] args)
	{
		
		int n=818;
		
		int temp=n;
		
		int rev=0;
		
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		if(temp==rev)
		{
			System.out.println("its polindrum " +temp);
		}
		else
		{
			System.out.println("not a polindrum "+temp);
		}
		

	}

}
