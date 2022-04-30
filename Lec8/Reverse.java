package Lec8;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5325;
		
		int d = (int)Math.log10(n);
		int ans = 0;
		
		while(n!=0)
		{
			int rem = n%10;
//			ans = ans + rem*(int)Math.pow(10, d);
			ans = ans*10+rem;
			
			d -= 1;
			n = n/10;
		}
		System.out.println(ans);
		
		

	}

}
