package Lec3;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i  =1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i = i+1;
		}
		System.out.println("Bye");

	}

}
