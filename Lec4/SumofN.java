package Lec4;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i  =1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(i<=n)
		{
//			System.out.println(i);
			sum = sum + i;
			i = i+1;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Bye");

	}

}
