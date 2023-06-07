package in.ineuron;

public class Sixth {
		public static int Nth_of_AP(int a,int d,int N)
		{
			return ( a + (N - 1) * d );
		}
		public static void main(String[] args)
		{
			int a = 5;
			int d = 2;
			int N = 10;
			System.out.print("The "+ N +"th term of the series is : " +Nth_of_AP(a, d, N));
		}
	}
