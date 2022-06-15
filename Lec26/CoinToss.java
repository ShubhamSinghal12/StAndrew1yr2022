package Lec26;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ct(2, "");
		System.out.println(ct2(3));
	

	}
	public static void ct(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return;
		}
		else
		{
			ct(n-1, ans+"H");
			ct(n-1, ans+"T");
		}
	}
	public static ArrayList<String> ct2(int n)
	{
		if(n == 1)
		{
			return new ArrayList<String>(Arrays.asList("H","T"));
		}
		else
		{
			ArrayList<String> rr = ct2(n-1);
			ArrayList<String> ans = new ArrayList<String>();
			for(String val : rr)
			{
				ans.add(val+"H");
				ans.add(val+"T");
			}
			return ans;
		}
	}

}
