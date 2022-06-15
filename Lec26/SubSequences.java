package Lec26;

import java.util.ArrayList;

public class SubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(ss("abc"));
		ss2("abc", "");

	}
	
	public static ArrayList<String> ss(String st)
	{
		if(st.length() == 0)
		{
			ArrayList<String> ans = new ArrayList<String>();
			ans.add("");
			return ans;
		}
		else
		{
			ArrayList<String> rr = ss(st.substring(1));
			ArrayList<String> ans = new ArrayList<String>();
			for(String val:rr)
			{
				ans.add(val);
				ans.add(st.charAt(0)+val);
			}
			return ans;
		}
	}
	public static void ss2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			ss2(ques.substring(1), ans+ques.charAt(0));
			ss2(ques.substring(1), ans);
		}
	}

}
