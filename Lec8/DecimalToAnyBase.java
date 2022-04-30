package Lec8;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 57;
		
		int multi = 1;
		int ans = 0;
		int base = 8;
		
		while(n!= 0)
		{
			int rem = n%base;
			ans += rem*multi;
			
			multi = multi*10;
			 n /= base;
		}
		System.out.println(ans);

	}

}
