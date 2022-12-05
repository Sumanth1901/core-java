package com;

import java.util.Iterator;

public class Patt {

	public static void main(String[] args) {
		
		int n=4;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				
				if(i==3 && j==3)
				{
					System.out.print("x-workz"+" ");
				}
				else {
				System.out.print(j+" ");
				
			}
			
			
			}
		
		System.out.println(" ");
		}
	
		
		System.out.println("=================================");
		System.out.println("=================================");
		System.out.println("=================================");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				
				if(i==1 && j==1)
				{
					System.out.print("x-workz"+" ");
				}
				else {
				System.out.print(i+" ");
				
			}
			}
			System.out.println("");

	}

}
}