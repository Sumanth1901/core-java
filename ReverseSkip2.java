package com;

public class ReverseSkip2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="shivamogga";
				char c[]=str.toCharArray();
		for (int i = c.length-1; i >= 0; i= i-3) {
			
			System.out.print(c[i]);
			
		}

	}

}
