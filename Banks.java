package tech;

public class Banks {
	static String banks[]= {null,null,null,null,null};
	static int i;

	public static void getbanks() 
	{
		for(int i=0;i<banks.length;i++) 
		{
			String ref =banks[i];
			System.out.println("Banks name is " +ref);
		}

	}
	public static boolean setbanks(String name) 
	{
		if(i<banks.length ) 
		{
			banks[i++]=name;
		}
		else
		{
			System.out.println("check youer array[] its invalid" );
		}
		System.out.println("Banks end" );
		return false;
	}



}
