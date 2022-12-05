package com;

public class StringRev {

	public static void main(String[] args) {
		
		String a="sumanth";
		int i=0;
		String rstr="";
		
		for(char b:a.toCharArray())
		{
			char c=a.charAt(i);
			i++;
			rstr=c+rstr;
		}
		System.out.println(rstr);

	}

}
