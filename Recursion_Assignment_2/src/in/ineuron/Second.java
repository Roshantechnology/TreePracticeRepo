package in.ineuron;
public class Second {
	    public static int lastRemaining(int n) {
	        boolean left = true;
	        int head = 1;
	        int step = 1;
	        int remain = n;
	        while(remain > 1){
	            if(left || remain % 2 == 1){
	                head = head + step;
	            }
	            step = step * 2;
	            remain = remain / 2;
	            left = !left;
	        }
	        return head;
	    }
	public static void main(String[] args) {
		int n=9;
		int lastRemaining = lastRemaining(n);
		System.out.println(lastRemaining);
	}
}
