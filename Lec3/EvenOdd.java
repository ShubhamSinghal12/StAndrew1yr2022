package Lec3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		System.out.println("Bye");
		

	}

}
