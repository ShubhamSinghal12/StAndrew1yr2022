package Lec23;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PI2(4,10);
//		PDI(5);
		System.out.println(sum(5));

	}
	public static void PD(int n)
	{
		if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			PD(n-1);
		}
	}
	
	public static void PI(int n)
	{
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			PI(n-1);
			System.out.println(n);
		}
	}
	
	
	public static void PI2(int i,int n)
	{
		if(n==i)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(i);
			PI2(i+1,n);
		}
	}
	
	
	public static void PDI(int n)
	{
		if(n == 0)
		{
			System.out.println(0);
			return;
		}
		else
		{
			System.out.println(n);
			PDI(n-1);
			System.out.println(n);
		}
	}
	
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return sum(n-1)+n;
		}
	}

}
