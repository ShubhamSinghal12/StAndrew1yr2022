package Lec21;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		String st = "lHellollo";
//		System.out.println(st);
//		System.out.println(st.length());
//		System.out.println(st.charAt(4));
//		String s = st.substring(2,5);
//		System.out.println(s);
//		System.out.println(st.startsWith("Hal"));
//		System.out.println(st.endsWith("lloo"));
//		System.out.println(st.indexOf("ll"));
//		System.out.println(st.lastIndexOf("ll"));
		
//		String s1 = "Hello";
//		String s2 = "Hello";
//		String s3 = new String("Hello");
//		String s4 = new String("Hello");
//		
//		System.out.println(s1==s3);
//		System.out.println(s3==s4);
//		
//		System.out.println(s1.replace('l', 'r'));
//		System.out.println(s1);
//		
//		s1 = s1.concat(" Bye");
//		System.out.println(s1);
		
		String s = "";
		long start = System.currentTimeMillis();
		for(int i = 1; i < 100000;i++)
		{
			s += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		

	}

}
