package Lec5;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		
		
		int nst = n;
		int row = 1;
		
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			nst -= 1;
			System.out.println();
			row += 1;
		}

	}

}
