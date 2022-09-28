package tech;

public class Stadiums {
	static String stadiums[]= {null,null,null,null,null};
	static int i;

	public static void getstadiums() 
	{
		for(int i=0;i<stadiums.length;i++) 
		{
			String ref =stadiums[i];
			System.out.println("Stadiums is " +ref);
		}

	}
	public static boolean setstadiums(String name) 
	{
		if(i<stadiums.length ) 
		{
			stadiums[i++]=name;
		}
		else
		{
			System.out.println("check youer array[] its invalid" );
		}
		System.out.println("stadiums end" );
		return false;
	}
}
