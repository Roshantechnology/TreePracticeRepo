package in.ineuron;

public class First {

	public boolean isPowerOfN(int n) {
		
		if(n<=0)
		return false;
		if(n==1)
		return true;
		if(n%4==0)
		return isPowerOfN(n/4);
		return false;
		
	}
	public static void main(String[] args) {
		int n=3;
		System.out.println(new First().isPowerOfN(n));
	}

}
