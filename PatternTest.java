package com;

public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n=6;
				for (int i = 0; i <=n; i++) {
					for (int j = 0; j <=n; j++) {
						
						if(i==1 || i==6)
						{
							System.out.print("* ");
						}
						else if(i==0 && j<4)
						{
							System.out.print("*   ");
						}
						else if(j<3)
						{
							System.out.print("*     ");
						}
						
					}
					System.out.println(" ");
					
				}

//		int n=6;
//		for (int i = 0; i < n; i++)
//		{
//
//			for (int j = 5;j>=0 ;j--) 
//			{
//				System.out.print(" ");
//
//			}
//			for (int j2 = 0; j2 <= i; j2++) {
//				System.out.print("*");
//
//			}
//			//System.out.print("*");
//			System.out.println();
//
//
//		}

	}

}
