package Lec5;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nsp = 0;
		int nst = n;
		
		while(row <= n)
		{
			//Work
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			//Update
			
			nst -= 1;
			nsp += 2;
			
			row += 1;
			System.out.println();
		}

	}

}
