package Lec14;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr = {1,1,1,2,2,2,2,3,3,4,4,5,6,7,7,7,8,8,9};
		System.out.println(upperBound(arr, 2));
	}
	
	
	public static int binarySearch(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si<=ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static int lowerBound(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		int ans = -1;
		while(si<=ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else {
				ans = mid;
				ei = mid-1;
			}
		}
		return ans;
	}
	
	public static int upperBound(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		int ans = -1;
		while(si<=ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else {
				ans = mid;
				si = mid+1;
			}
		}
		return ans;
	}

}
