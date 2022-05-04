package Lec9;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = (byte)673;
		System.out.print(b);
		short s = 10;
		int i = 10;
		long l = 10;
		
		s = b;
		s = (short)l;
		
		i = (int)l;
		
		float f = 10.0f;
		
		double d = f; 
		
		char ch = 'a';
		ch = (char)(ch+1);
		
		System.out.println(ch);
		
		String st = "abc";
		st = st+(char)123;
		System.out.println(st);
		
		System.out.println(2+3+"Hello"+2+3);
		
		
		
		

	}
	

}
