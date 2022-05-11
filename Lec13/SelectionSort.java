package Lec13;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,1,2,4,-1,5,3,2,0};
		System.out.println(minInd(arr, 3));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static int minInd(int[] arr,int i)
	{
		int min = i;
		for(int j = i+1; j < arr.length;j++)
		{
			if(arr[min] > arr[j])
				min = j;
		}
		
		return min;
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1;i++)
		{
//			int m = minInd(arr, i);
			int min = i;
			for(int j = i+1; j < arr.length;j++)
			{
				if(arr[min] > arr[j])
					min = j;
			}
			int m = min;
			int t = arr[i];
			arr[i] = arr[m];
			arr[m] = t;
		}
	}

}
