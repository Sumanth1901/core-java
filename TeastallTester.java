package tech;

public class TeastallTester {
	public static void main(String[] args) {
		Teastall.setTeaStallId(4567);
		Teastall.setName("Sumanth tea stall");
		Teastall.setaddress("shimogga");
		Teastall.setphno(4534534989555L);
		System.out.println("---------------------------");
		System.out.println("tea stall Id is " +Teastall.getteaStallId());
		System.out.println("---------------------------");
		System.out.println("tea stall name  is " +Teastall.getName());
		System.out.println("---------------------------");
		System.out.println("tea stall address is " +Teastall.getaddress());
		System.out.println("---------------------------");
		System.out.println("tea stall phon is " +Teastall.getphno());
	}
	
}
