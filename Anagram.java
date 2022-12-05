package com;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean v=true;
		String st="asum";
		String st1="sum";
		
		if(st.length()!=st1.length())
		{
			v=false;
		}
		else
		{
			char[] a =st.toCharArray();
			char[] b=st1.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			 v=Arrays.equals(a, b);
		}
	
		
		if(v)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		

	}

}
