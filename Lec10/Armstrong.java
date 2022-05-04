package Lec10;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAll(1000);

	}
	
	public static int countDigits(int n) {
		
		return (int)Math.log10(n)+1;
	}
	
	public static boolean isArmstrong(int n) {
		
		int nod = countDigits(n);
		int sum = 0;
		int t = n;
		while(n!= 0)
		{
			int rem = n%10;
			sum += (int)Math.pow(rem, nod);
			
			n/=10;
		}
		
		return sum == t;
	}
	
	public static void printAll(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			if(isArmstrong(i))
				System.out.println(i);
		}
	}

}
