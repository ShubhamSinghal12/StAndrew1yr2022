package Lec6;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		
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
				if(cst%2 != 0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				cst += 1;
			}
			
			//Update
			nsp -= 1;
			nst += 2;
			row += 1;
			System.out.println();
		}

	}

}