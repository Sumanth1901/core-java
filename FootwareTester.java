package com;

public class FootwareTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Footware f=new Footware(123, " Medium "," Black-laced  "," Black "," Heels "," Lunars");
       System.out.println(f.id + f.size + f.name + f.color + f.model + f.brandName);
      
     
       System.out.println("--------------------------------------------------------");
       Footware f1=new Footware(111, " Small ", " White-laced ", " Pink ", " Heels "," Walkmate ");
       
       
       System.out.println(f1.id + f1.size + f1.name + f1.color + f1.model + f1.brandName);
	}

}


