package Lec11;

import java.util.Scanner;

public class ArraysDemo {
	
	public static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
//		System.out.println(arr);
//		System.out.println(arr.length);
//		
//		System.out.println(arr[2]);
//		arr[2] = 100;
//		System.out.println(arr[2]);
//		
//		int[] brr = new int[5];
//		brr[1] = 1000;
//		System.out.println(brr[1]);
//		brr = arr;
//		System.out.println(brr[1]);
		
//		int[] arr = null;
//		arr = new int[5];
		
//		int[] arr,c = null;
//		int arr[],d = 0;
//		System.out.println(c);
		
//		int[] arr = null;
//		arr = new int[]{1,2,3,4,5};
//		System.out.println(arr[4]);
		int[] arr = takeInput(5);
		display(arr);

	}
	
	
	public static int[] takeInput(int n)
	{
		int[] arr = new int[n];
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void display(int[] arr)
	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		for(int val: arr)
		{
			System.out.println(val+" ");
		}
		System.out.println();
		
		
		
	}

}
