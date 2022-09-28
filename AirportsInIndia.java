package tech;

public class AirportsInIndia {
	
		static String airports[]= {null,null,null,null,null};
		static int i;

		public static void getairports() 
		{
			for(int i=0;i<airports.length;i++) 
			{
				String ref =airports[i];
				System.out.println("AirportsInIndia is " +ref);
			}

		}
		public static boolean setairports(String name) 
		{
			if(i<airports.length ) 
			{
				airports[i++]=name;
			}
			else
			{
				System.out.println("check youer array[] its invalid" );
			}
			System.out.println("airports end" );
			return false;
		}


}
