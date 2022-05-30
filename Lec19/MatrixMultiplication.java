package Lec19;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2},{3,4}};
		int[][] brr = {{1,2,3},{4,5,6}};
		int[][] ans = multi(arr, brr);
		
		display(ans);

	}
	public static void display(int[][] arr)
	{	
		for(int[] i :arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] multi(int[][] arr,int[][] brr)
	{
		int[][] ans = new int[arr.length][brr[0].length];
		
		for(int i = 0;i < arr.length; i++)
		{
			for(int j = 0; j < brr[0].length; j++)
			{
				int sum = 0;
				for(int k = 0; k < brr.length;k++)
				{
					sum += arr[i][k]*brr[k][j];
				}
				ans[i][j] = sum;
			}
		}
		
		return ans;
	}

}
