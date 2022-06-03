package Lec20;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,0,9,3,7};
		int[] brr = {9,8,4,7};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int i = arr.length-1;
		int j = brr.length-1;
		int c = 0;
		while(i >= 0 || j >= 0)
		{
			int sum = c;
			if(i >= 0)
			{
				sum += arr[i];
				i--;
			}
			if(j >= 0)
			{
				sum += brr[j];
				j--;
			}
			c = sum/10;
			al.add(sum%10);
		}
		if(c>=1)
			al.add(c);
		Collections.reverse(al);
		System.out.println(al);

	}

}
