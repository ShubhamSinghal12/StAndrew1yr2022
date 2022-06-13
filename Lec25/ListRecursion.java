package Lec25;

import java.util.ArrayList;

public class ListRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,4,2,5};
//		display2(arr, arr.length-1);
//		System.out.println(lastOcc2(arr, 0, 2));
//		AllOcc(arr, 0, 2);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		AllOcc2(arr, 0, 2, ans);
		System.out.println(ans);

	}
	
	public static void display(int[] arr,int i)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			System.out.println(arr[i]);
			display(arr, i+1);
		}
	}
	public static void display2(int[] arr,int i)
	{
		if(i == -1)
		{
//			System.out.println(arr[i]);
			return;
		}
		else
		{
			display2(arr, i-1);
			System.out.println(arr[i]);
		}
	}

	public static int search(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return -1;
		}
		else
		{
			if(arr[i] == ele)
			{
				return i;
			}
			else
			{
				return search(arr, i+1, ele);
			}
		}
	}
	public static int lastOcc(int[] arr,int i,int ele)
	{
		if(i == -1)
		{
			return -1;
		}
		else
		{
			if(arr[i] == ele)
			{
				return i;
			}
			else
			{
				return lastOcc(arr, i-1, ele);
			}
		}
	}
	
	public static int lastOcc2(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return -1;
		}
		else
		{
			int ans =  lastOcc2(arr, i+1, ele);
			if(ans == -1)
			{
				if(arr[i] == ele)
				{
					return i;
				}
				else
				{
					return -1;
				}
			}
			return ans;
		}
	}

	public static void AllOcc(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			if(arr[i] == ele)
			{
				System.out.println(i);;
			}
			AllOcc(arr, i+1, ele);
		}
	}
	public static void AllOcc2(int[] arr,int i,int ele,ArrayList<Integer> ans)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			if(arr[i] == ele)
			{
//				System.out.println(i);;
				ans.add(i);
			}
			AllOcc2(arr, i+1, ele,ans);
		}
	}
}
