package Lec8;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345;
		int t = 123456;
		int count = 0;
		while(n!= 0)
		{
			n = n/10;
			count += 1;
		}
		System.out.println(count);
		
		System.out.println((int)Math.log10(t)+1);

	}

}
