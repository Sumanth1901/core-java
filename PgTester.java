package tech;

public class PgTester {

	
		public static void main(String args[])
		{
		Pg.setpgId(101);
		Pg.setpgName("kushi");
		Pg.setprice(5000);
		System.out.println("==================================");
		System.out.println("pgId is " +Pg.getpgId());
		System.out.println("==================================");
		System.out.println("pgName is " +Pg.getpgName());
		System.out.println("==================================");
		System.out.println("price is " +Pg.getprice());
		System.out.println("==================================");
		
		}
	}


