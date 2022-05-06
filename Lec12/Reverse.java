package Lec12;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		reverse(arr,1,5);
		System.out.println(Arrays.toString(arr));

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
			 
			si++;
			ei--;
		}
	}

}
