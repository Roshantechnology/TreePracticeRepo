package in.ineuron;

public class First {
	public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
		public static void main(String[] args)
		{
			int n = 27;
			System.out.println(new First().isPowerOfThree(n));
			
}
}
