package in.ineuron;

public class Fourth {

	public static int PowerOfN(int N, int P) {
		if(P==0)
			return 1;
		return (N*PowerOfN(N, P-1));
	}
	public static void main(String[] args) {
		int N = 5;
		int P = 2;
		int ans = PowerOfN(N,P);
		System.out.println(ans);
	}

}
