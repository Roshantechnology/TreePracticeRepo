package in.ineuron;

public class SquareRoot {
	public static int SquareRootNum(int X) {
		if(X==0 || X==1)
			return X;
		int result=1,i=1;
		while(result<=X) {
			i++;
			result=i*i;
		}
		return i-1;
		
	}

	public static void main(String[] args) {
		int X=8;
		System.out.println(SquareRootNum(X));
	}

}
