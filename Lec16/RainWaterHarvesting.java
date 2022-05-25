package Lec16;

import java.util.Arrays;

public class RainWaterHarvesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 2, 1, 3, 0, 1, 2, 1, 2, 1};
		rt(arr);

	}
	
	public static int lmax(int[]  arr, int j)
	{
		int max = arr[j];
		for(int i = j-1; i>= 0;i--)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static int rmax(int[]  arr, int j)
	{
		int max = arr[j];
		for(int i = j+1; i<= arr.length-1;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static void rainTrap(int[] arr)
	{
		int ans = 0;
		for(int i = 0;i<arr.length;i++)
		{
			int l = lmax(arr, i);
			int r = rmax(arr, i);
			int m = Math.min(l, r);
			ans += m-arr[i];
		}
		System.out.println(ans);
	}
	public static void rt(int[] arr)
	{
		int[] lmax = new int[arr.length];
		int[] rmax = new int[arr.length];
		
		lmax[0] = arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			lmax[i] = Math.max(arr[i],lmax[i-1]);
		}
		System.out.println(Arrays.toString(lmax));
		rmax[arr.length-1] = arr[arr.length-1];
		for(int i = arr.length-2; i >= 0; i--)
		{
			rmax[i] = Math.max(arr[i],rmax[i+1]);
		}
		System.out.println(Arrays.toString(rmax));
		
		int ans = 0;
		for(int i = 0; i < arr.length; i++)
		{
			ans += Math.min(lmax[i], rmax[i]) - arr[i];
		}
		System.out.println(ans);
		
	}

}
