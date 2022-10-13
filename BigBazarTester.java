package tech;

public class BigBazarTester {
	public static void main(String[] args) {
		
	BigBazar i=new BigBazar();
	i.productNames="jewelry";
	i.location="Bangalore";
	i.cost=8000;
	System.out.println("================");
	System.out.println(i.productNames+"\n"+i.location+"\n"+i.cost);
	System.out.println("===========");	
	BigBazar i1=new BigBazar();
	i1.productNames="toys";
	i1.location="Mysore";
	i1.cost=4000;
	System.out.println("===============");
	System.out.println(i1.productNames+"\n"+i1.location+"\n"+i1.cost);
	System.out.println("============");
	BigBazar i2=new BigBazar();
	i2.productNames="groceries";
	i2.location="Shimoga";
	i2.cost=3000;
	System.out.println("===============");
	System.out.println(i2.productNames+"\n"+i2.location+"\n"+i2.cost);
	System.out.println("============");
	System.out.println("===========");	
	BigBazar i3=new BigBazar();
	i3.productNames="pen";
	i3.location="Shimoga";
	i3.cost=40;
	System.out.println("===============");
	System.out.println(i3.productNames+"\n"+i3.location+"\n"+i3.cost);
	System.out.println("============");
	BigBazar i4=new BigBazar();
	i4.productNames="book";
	i4.location="davangere";
	i4.cost=80;
	System.out.println("===============");
	System.out.println(i4.productNames+"\n"+i4.location+"\n"+i4.cost);
	System.out.println("============");

	}

}
