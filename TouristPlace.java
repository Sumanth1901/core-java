package tech;

public class TouristPlace {
	static String touristPlace[]= {null,null,null,null,null};
	static int i;

	public static void gettouristplace() 
	{
		for(int i=0;i<touristPlace.length;i++) 
		{
			String ref =touristPlace[i];
			System.out.println("TouristPlace is " +ref);
		}

	}
	public static boolean settouristplace(String name) 
	{
		if(i<touristPlace.length ) 
		{
			touristPlace[i++]=name;
		}
		else
		{
			System.out.println("check youer array[] its invalid" );
		}
		System.out.println("TouristPlace end" );
		return false;
	}

}
