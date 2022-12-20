package com;

public class Intersection {

	public static void main(String[] args) {
		
		int y=0;
		
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {3,4,5,6,7,8,98};

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{

				if(a[i]==b[j])
				{
					y=a[i];
					System.out.println(y);
					
				}

			}
			

		}


	}

}
