package com;

public class Sheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String[] a= {"true","false","true","true","false","true"
				,"true","false","true","true","false","true"};
		for (int i = 0; i < a.length; i++) {
			
			if(a[i].equals("true"))
			{
				count++;
			}
		}
		System.out.println("sheeps are "+count);

	}

}
