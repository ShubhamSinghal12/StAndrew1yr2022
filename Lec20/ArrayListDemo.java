package Lec20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5,6,7,8));
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
//		System.out.println(al);
//		System.out.println(al.size());
		al.add(1,100);
//		System.out.println(al);
		
//		System.out.println(al.get(3));
		al.set(1, 500);
//		System.out.println(al);
//		al.remove(1);
//		System.out.println(al);
		System.out.println(al);
		System.out.println(al.contains(1));
		al.sort(null);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		

	}

}
