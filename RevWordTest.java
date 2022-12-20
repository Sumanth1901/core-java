package com;

public class RevWordTest {
	public static void main(String[] args) {
		String s="yes everyone! are useing elsee is are working";
		String b="";
	String rev="";
	String rev1="";

		String[] s1=s.split(" ");
		for (int i = 0; i < s1.length; i++)
		{
			//System.out.println(s1[i]+" ");
			if(s1[i].equals("elsee"))
			{
				 b=s1[i];
				// System.out.println(b);
			
				 for (int j = b.length()-1; j >= 0 ; j--) 
				{
					rev=rev+b.charAt(j);
					
				}
				// System.out.println(rev);
			}
			
			if(s1[i].equals("is"))
			{
			String c=s1[i];
				for (int k = c.length()-1; k >=0 ; k--) 
				{
					rev1 += c.charAt(k);
					
				}
				//System.out.println(rev1);
			}
			
			if(s1[i].equals("elsee") )
			{
				
				s1[i]=rev;
			
			}
			if(s1[i].equals("is"))
			{
				s1[i]=rev1;
			}
			
		
		}
		
	
	
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+" ");
		}
		

		
	}

}
