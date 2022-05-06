package Lec12;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		rotatek(arr,-103);
		System.out.println(Arrays.toString(arr));

	}
	public static void rotate(int[] arr)
	{
		int t = arr[arr.length-1];
		for(int i = arr.length-1; i>= 1;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = t;
	}
	public static void rotatek(int[] arr,int k)
	{
		k = k%arr.length;
		if(k < 0)
			k += arr.length;
		for(int i = 0; i < k; i++)
		{
			rotate(arr);
		}
	}

}
