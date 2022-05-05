package Lec11;

import java.util.Arrays;

public class ArraysOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,4,1,5,0};
//		maxA(arr);
//		System.out.println(search(arr, 4));
		reverse(arr,1,4);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void maxA(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i: arr)
		{
			if (i > max)
			{
				max = i;
			}
		}
		System.out.println(max);
	}
	
	public static int search(int[] arr,int ele)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == ele)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void reverse(int[] arr,int si,int ei)
	{
//		int si = 0;
//		int ei = arr.length-1;
		while(si < ei)
		{
			int t = arr[si];
			arr[si] = arr[ei];
			arr[ei] = t;
			
			si += 1;
			ei -= 1;
		}
		
	}

}
