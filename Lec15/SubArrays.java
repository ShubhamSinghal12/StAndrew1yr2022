package Lec15;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,3,4,-5,6,-10,1,2};
		printSS(arr);
		System.out.println("----------------");
		SumSS2(arr);
		System.out.println("----------------");
		kadanes(arr);
		

	}
	public static void printSS(int[] arr)
	{
		for(int i = 0; i <arr.length; i++)
		{
			for(int j = i; j < arr.length;j++)
			{
//				System.out.println(i+" "+j);
				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
		
		public static void SumSS(int[] arr)
		{
			for(int i = 0; i <arr.length; i++)
			{
				for(int j = i; j < arr.length;j++)
				{
//					System.out.println(i+" "+j);
					int sum = 0;
					for(int k = i; k <= j; k++)
					{
						sum += arr[k];
					}
//						System.out.print(arr[k]+" ");
					
					System.out.println(sum);
				}
			}
		}
		public static void MaxSumSS(int[] arr)
		{
			int max = Integer.MIN_VALUE;
			for(int i = 0; i <arr.length; i++)
			{
				for(int j = i; j < arr.length;j++)
				{
//					System.out.println(i+" "+j);
					int sum = 0;
					for(int k = i; k <= j; k++)
					{
						sum += arr[k];
					}
//						System.out.print(arr[k]+" ");
					if(sum > max)
						max = sum;
//					System.out.println(sum);
				}
			}
			System.out.println(max);
		}
		
		public static void SumSS2(int[] arr)
		{
			for(int i = 0; i <arr.length; i++)
			{
				int sum = 0;
				for(int j = i; j < arr.length;j++)
				{
//					System.out.println(i+" "+j);
					sum += arr[j];
//						System.out.print(arr[k]+" ");
					
					System.out.println(sum);
				}
			}
		}
		
		public static void MaxSumSS2(int[] arr)
		{
			int max = Integer.MIN_VALUE;
			for(int i = 0; i <arr.length; i++)
			{
				int sum = 0;
				for(int j = i; j < arr.length;j++)
				{
//					System.out.println(i+" "+j);
					
					sum += arr[j];
//						System.out.print(arr[k]+" ");
					if(sum > max)
						max = sum;
//					System.out.println(sum);
				}
			}
			System.out.println(max);
		}
		
		public static void kadanes(int[] arr)
		{
			int sum = 0;
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < arr.length; i++)
			{
				sum += arr[i];
				if(max < sum)
					max = sum;
				
				if(sum < 0)
					sum = 0;
			}
			System.out.println(max);
		}

}
