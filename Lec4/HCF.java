package Lec4;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 32;
		int b = 24;
		int i = 1;
		int hcf = 1;
//		while(i <= a)
//		{
//			if(a%i == 0 && b%i == 0)
//			{
//				System.out.println(i);
//				hcf = i;
//			}
//			
//			i += 1;
//		}
//		System.out.println("HCF: "+hcf);
		
		while(a%b != 0)
		{
			int r = a%b;
			
			a = b;
			b = r;
		}
		
		System.out.println(b);

	}

}
