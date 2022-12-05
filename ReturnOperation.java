package com;

public class Deno {
	
	 static int operation(char n,int a,int b)
	 
	 {
		if(n=='+')
		{
			return a+b;
		}
		if(n=='-')
		{
			return a-b;
		}
		if(n=='*')
		{
			return a*b;
		}
		if(n=='/')
		{
			return a/b;
		}
		return 0;
	 }
	 public static void main(String[] args) {
	
		System.out.println(operation('+',2,3));
		System.out.println(operation('-',2,3));
		System.out.println(operation('*',2,3));
		System.out.println(operation('/',2,3));
	}

}
