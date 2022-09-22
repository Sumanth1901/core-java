import java.util.Scanner;

class Operations
{
	public static void main(String[] args)
	{
	int res;
	Scanner s=new Scanner(System.in);
	System.out.println("1.addition\n 2.sub \n 3.mul \n 4.div\n");
	System.out.println("enter the choice");

	int choice=s.nextInt();
	System.out.println("enter the a");
	int a=s.nextInt();
	System.out.println("enter the b");
	int b=s.nextInt();



	switch(choice)
	
		{
			case 1: res=a+b;
					System.out.println("addition is " + res);
					break;
			case 2: res=a-b;
					System.out.println("sub"+res);
					break;
			case 3: System.out.println(a*b);
					break;
			case 4: System.out.println(a/b);
					
			
			default:System.out.println("inavlid");
	}


}
}