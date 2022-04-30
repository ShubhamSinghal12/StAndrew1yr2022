package Lec8;

public class BinaryTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 71;
		
		int multi = 1;
		int ans = 0;
		int base = 8;
		
		while(n!= 0)
		{
			int rem = n%10;
			ans += rem*multi;
			
			multi = multi*base;
			 n /= 10;
		}
		System.out.println(ans);

	}

}
