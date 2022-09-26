package tech;

public class VesselTester {
	
		public static void main(String args[])
		{
		Vessel.setvesselName("pan");
		Vessel.setprice(250);
		Vessel.setbrand("preethi");
		System.out.println("==================================");
		System.out.println("vesselName " +Vessel.getvesselName());
		System.out.println("==================================");
		System.out.println("Price is " +Vessel.getprice());
		System.out.println("==================================");
		System.out.println("brand" +Vessel.getbrand());
		System.out.println("==================================");
		}


}
