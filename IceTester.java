package com;

public class IceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ice i=new Ice(" Arun " , 1050 , " Mango " , 50);
		System.out.println(i.brandname + i.price + i.flavour+ i.quantity);
	      
	     
	       System.out.println("--------------------------------------------------------");
	       Soft i1=new Soft(" Amul " , 150 , " Chocolate " , 150);
			System.out.println(i1.brandname + i1.price + i1.flavour+ i1.quantity);
		      
	}

}
