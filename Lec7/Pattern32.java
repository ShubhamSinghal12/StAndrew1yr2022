package Lec7;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		int nst = 1;
		int val = 1;
		while(row <= 2*n-1)
		{
			int cst = 1;
			int cval = val;
			while(cst <= nst)
			{
				if(cst %2 == 0)
				{
					System.out.print("* ");
				}
				else
					System.out.print(cval+" ");
				cst += 1;
			}
			
			if(row < n)
			{
				nst += 2;
				val += 1;
			}
			else
			{
				nst -= 2;
				val -= 1;
			}
			
			row += 1;
			System.out.println();
		}

	}

}
