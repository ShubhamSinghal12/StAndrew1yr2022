package Lec13;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,2,1,4};
		BS(arr);
//		System.out.println(Arrays.toString(arr));

	}
	public static void BS(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int swap = 0;
			for(int j = 0; j < arr.length-1-i;j++)
			{
				if(arr[j] >arr[j+1])
				{
					swap += 1;
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			if(swap == 0)
				break;
			
			System.out.println(Arrays.toString(arr));
		}
	}

}
