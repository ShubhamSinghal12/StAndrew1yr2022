package Lec21;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SS("nitin");
		
		System.out.println(isPalindrome("nitin"));
		System.out.println(countSS("nitinnn"));

	}
	public static void SS(String st)
	{
		for(int i = 0; i < st.length(); i++)
		{
			for(int j = i; j < st.length(); j++)
			{
				System.out.println(st.substring(i,j+1));
			}
		}
	}
	
	public static int countSS(String st)
	{
		int c = 0;
		for(int i = 0; i < st.length(); i++)
		{
			for(int j = i; j < st.length(); j++)
			{
				if(isPalindrome(st.substring(i,j+1)))
				{
					c++;
				}
			}
		}
		return c;
	}
	
	public static boolean isPalindrome(String st)
	{
		int si = 0;
		int ei = st.length()-1;
		while(si<ei)
		{
			if(st.charAt(ei) != st.charAt(si))
			{
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}
	
	

}
