package Lec20;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 127;
		Integer j = 127;
		Integer k = Integer.valueOf(1000);
		System.out.println(i == j);
		int a = j.intValue();
		int b= j;
		System.out.println(a+" "+b);
		Integer z = j;
		System.out.println(z==j);

	}

}
