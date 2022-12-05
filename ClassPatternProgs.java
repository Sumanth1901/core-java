package search;

public class Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 6; i++) {
			System.out.println(i);
			//System.out.print(i);
			
		}
			System.out.println("=====================");
			
		for (int i = 1; i <= 6; i++) {
			//System.out.println(i);
			System.out.print(" "+i);
			
		}
		System.out.println("");

		
		System.out.println("=====================");
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("======================");
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		System.out.println("===================");
		for(int i=3;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" #");
			}
			System.out.println(" ");
	}
		
		System.out.println("===================");
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" #");
			}
			System.out.println(" ");
	}
		
		System.out.println("==========");
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
	}
		
		System.out.println("==========");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
	}
		System.out.println("==========");
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
	}
	System.out.println("=====================");
		
		int a[]= {2,3,5,6,34,7,5,8,123,4,5,6};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				System.out.println("even "+a[i]  );
			}
			if(a[i]%2!=0)
			{
				System.out.println("odd "+a[i]);
			}
		

}
}
}
