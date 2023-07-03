package in.ineuron;

public class Fifth {
	public int findTheWinner(int n, int k) {
	        int ans = 0;
	        for(int i = 1; i <= n; i++)
	        {
	            ans = (ans + k) % i;
	        }
	        return ans + 1;
	    }
	
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int n=5;
		int k=2;
		Fifth ans=new Fifth();
		
		System.out.println(ans.findTheWinner(n, k));
	}

}
