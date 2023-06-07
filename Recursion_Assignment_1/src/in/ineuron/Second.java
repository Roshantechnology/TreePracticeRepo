package in.ineuron;

public class Second {

	public static int SumOfN(int n) {
		if(n==1)
			return 1;
		return n+SumOfN(n-1);
		
	}
	public static void main(String[] args) {
		int n=5;
		int sum = SumOfN(n);
		System.out.println(sum);
		
	}

}
