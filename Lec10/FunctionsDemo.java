package Lec10;

public class FunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a = 10;
		int b = 20;
//		int c = add2(a,b);
//		System.out.println(c);
		System.out.println(add2(a, b));
//		subtract(a, b);
		System.out.println("Bye");

	}
	
	public static void add(int a,int b)
	{
		
		int c = a+b;
		subtract(a, b);
		System.out.println(c);
	}
	
	public static void subtract(int a,int b)
	{
		int c = a-b;
//		add(a,b);
		System.out.println(c);
	}
	
	public static int add2(int a,int b)
	{
		int c = a+b;
		return c;
	}

}
