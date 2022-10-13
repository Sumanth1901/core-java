package tech;

public class CromaTester {
	public static void main(String[] args) {
		Croma i=new Croma();
		i.productNames="AirConditioners";
		i.location="Bangalore";
		i.cost=8000;
		System.out.println("================");
		System.out.println(i.productNames+"\n"+i.location+"\n"+i.cost);
		System.out.println("===========");	
		Croma i1=new Croma();
		i1.productNames="Mobile";
		i1.location="Mysore";
		i1.cost=4000;
		System.out.println("===============");
		System.out.println(i1.productNames+"\n"+i1.location+"\n"+i1.cost);
		System.out.println("============");
		Croma i2=new Croma();
		i2.productNames="Television";
		i2.location="Shimoga";
		i2.cost=3000;
		System.out.println("===============");
		System.out.println(i2.productNames+"\n"+i2.location+"\n"+i2.cost);
		System.out.println("============");
		System.out.println("===========");	
		Croma i3=new Croma();
		i3.productNames="pen";
		i3.location="Shimoga";
		i3.cost=40;
		System.out.println("===============");
		System.out.println(i3.productNames+"\n"+i3.location+"\n"+i3.cost);
		System.out.println("============");
		Croma i4=new Croma();
		i4.productNames="book";
		i4.location="davangere";
		i4.cost=80;
		System.out.println("===============");
		System.out.println(i4.productNames+"\n"+i4.location+"\n"+i4.cost);
		System.out.println("============");

	}

}
