package com;

public class Array2d {
	
	public static void main(String[] args) {
		
		
		int a[][]=	  {{1,2},{8,9},{9,6},{4,7},{2,7}};
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <2; j++) {
				
				System.out.println("a"+"["+i+"]"+"["+j+"] = " +a[i][j]);
			}
			
		}
	}

}
