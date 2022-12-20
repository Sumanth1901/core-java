package com;

public class wordcountt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sumanth sumanth sumanth my my name is is you you ";
		String a="";
		//int cou=0;
		int len=0;
		String[] st=str.split(" ");
		
		for (int i = 0; i < st.length; i++) 
		{
			// len=0;
			int cou=1;
			for (int j = i+1; j < st.length; j++) {
			
			if(st[i].equals(st[j]))
			{
				
				cou++;
				//st[j]="0";
			}
		
			
		}
			if(cou>1) {
				System.out.println(st[i]+"  "+cou);
				
			}
			
			
	}
		
		

		
	}}
