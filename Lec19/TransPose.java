package Lec19;

public class TransPose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] brr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(brr);
		display(brr);
		System.out.println();
		lowerT(brr);

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
	
	public static void transpose(int[][] arr)
	{
		for(int i = 1;i<arr.length;i++)
		{
			for(int j = 0; j < i; j++)
			{
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
	}
	public static void lowerT(int[][] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
