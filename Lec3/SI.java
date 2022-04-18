package Lec3;

import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		
		int si = (p*r*t)/100;
		System.out.println(si);

	}

}
