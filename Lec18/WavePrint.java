package Lec18;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		Hwave(arr);

	}
	public static void Hwave(int [][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(i%2==0)
			{
				for(int j = 0; j < arr[0].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int j = arr[0].length-1;j >= 0;j--)
				{
					System.out.print(arr[i][j] +" ");
				}
			}
		}
	}
	
	public static void Vwave(int[][] arr)
	{
		for(int j = 0 ; j < arr[0].length;j++)
		{
			if(j%2 == 0)
			{
				for(int i = 0; i < arr.length; i++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int i = arr.length-1; i >= 0 ; i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
