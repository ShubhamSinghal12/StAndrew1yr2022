package Lec9;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minF = 0;
		int maxF = 100;
		int steps = 20;
		for(int f = minF; f <= maxF; f += steps)
		{
//			int c = (int)((5/9.0)*(f-32));
			int c = 5*(f-32)/9;
			System.out.println(c);
		}

	}

}
