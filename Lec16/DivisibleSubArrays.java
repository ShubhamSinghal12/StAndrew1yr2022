package Lec16;

import java.util.Arrays;

public class DivisibleSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,5,5,5,5};
		int[] sf = new int[arr.length];
		sf[0] = 1;
		int sum = 0;
		for(int i = 0; i < arr.length;i++)
		{
			sum += arr[i];
			sf[sum%arr.length]++;
		}
		System.out.println(Arrays.toString(sf));
		int ans = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(sf[i] >= 2)
			{
				ans += sf[i]*(sf[i]-1)/2;
			}
		}
		System.out.println(ans);
		

	}

}
