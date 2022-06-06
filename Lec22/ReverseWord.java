package Lec22;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(st);
		System.out.println(rw2(st));

	}
	
	public static String rw(String st)
	{
		int i = st.lastIndexOf(' ');
		String ns = "";
		while(i != -1)
		{
			ns = ns+st.substring(i+1) +" ";
			st = st.substring(0,i);
			
			i = st.lastIndexOf(' ');
		}
		return ns + st;
	}
	
	public static String rw2(String st)
	{
		String[] arr = st.split(" ");
		System.out.println(Arrays.toString(arr));
		String ns = "";
		for(int i = arr.length-1; i >= 0; i--)
		{
			ns += arr[i]+" ";
		}
		return ns;
	}

}
