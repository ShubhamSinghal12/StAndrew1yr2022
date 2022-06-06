package Lec22;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = sb;
		System.out.println(sb==sb3);
		sb.append(" Bye!!");
		System.out.println(sb3);
		sb.insert(2, "RRRRR");
		System.out.println(sb);
		sb.setCharAt(2, 'Y');
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.delete(2, 6);
		System.out.println(sb);
		String s = sb.substring(2,5);
		System.out.println(s);
		
		StringBuilder ns = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i = 1; i < 100000;i++)
		{
			ns.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		

	}

}
