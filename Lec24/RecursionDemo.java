package Lec24;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibTail(8,0,1));

	}
	public static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
		
	}
	public static int factTail(int n,int ans)
	{
		if(n == 0)
		{
			return ans;
		}
		else
		{
			return factTail(n-1,ans*n);
		}
		
	}
	
	public static int pow(int a,int b)
	{
		if(b == 0)
		{
			return 1;
			
		}
		else {
			return a*pow(a,b-1);
		}
	}
	public static int powTail(int a,int b,int ans)
	{
		if(b == 0)
		{
			return ans;
			
		}
		else {
			return powTail(a,b-1,a*ans);
		}
	}
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static int fibTail(int n,int a,int b)
	{
		if(n == 0)
		{
			return a;
		}
		else
		{
			return fibTail(n-1, b, a+b);
		}
		
	}

}
