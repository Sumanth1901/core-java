package com;

public class IronBoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IronBox i=new IronBox(12, " Orient-Electric " , 950 , " White and Blue");
		 System.out.println(i.id + i.name + i.cost + i.color);
	      
	     
	       System.out.println("--------------------------------------------------------");
	       
	       IronBox i1=new IronBox(17, " Crompton " , 2950 , " Purple");
			 System.out.println(i1.id + i1.name + i1.cost + i1.color);
		      

	       
	}

}