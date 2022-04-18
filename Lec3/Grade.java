package Lec3;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks >= 85)
		{
			System.out.println("A");
		}
		else if(marks >= 65)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
		
		System.out.println("Bye");

	}

}
