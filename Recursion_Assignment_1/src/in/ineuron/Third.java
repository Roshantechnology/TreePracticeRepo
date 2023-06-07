package in.ineuron;

public class Third {

	public static int factorials(int n) {
		if(n==1)
			return 1;
		return n*factorials(n-1);
	}
	public static void main(String[] args) {
		int n=5;
		int ans = factorials(n);
		System.out.println(ans);
	}

}
