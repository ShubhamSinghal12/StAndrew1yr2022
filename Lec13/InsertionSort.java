package Lec13;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,0,6,3,2,7,9,1,2,-1};
		IS(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insert(int[] arr,int i)
	{
		int t = arr[i];
		int j = i-1;
		while(j >= 0)
		{
			if(arr[j] > t)
			{
				arr[j+1] = arr[j];
			}
			else
			{
//				arr[j+1] = t;
				break;
			}
			j--;
		}
		arr[j+1] = t;
	}
	public static void IS(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
			insert(arr, i);
	}

}
