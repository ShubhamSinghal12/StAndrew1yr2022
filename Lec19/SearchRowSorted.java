package Lec19;

public class SearchRowSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3,5,8},{4,6,12,14},{5,7,13,15},{6,8,14,16}};
		System.out.println(search(arr, 10));

	}
	public static boolean search(int[][] arr,int ele)
	{
		int row = 0;
		int col = arr[0].length-1;
		while(row < arr.length && col >= 0)
		{
			if(arr[row][col] > ele)
			{
				col --;
			}
			else if(arr[row][col] < ele)
			{
				row ++;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

}
