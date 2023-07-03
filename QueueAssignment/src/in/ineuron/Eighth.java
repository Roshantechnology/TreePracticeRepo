package in.ineuron;

public class Eighth {

	    int val, main, count;
	    public Eighth(int value, int k) {
	        val = value;
	        main = k;
	        count = 0;
	    }

	    public boolean consec(int num) {
	        if (num == val) 
	        	count++;
	        else count = 0;
	        return count >= main;
	       
	    } 
	    
	
	public static void main(String[] args) {
		Eighth dataStream = new Eighth(4, 3);
		System.out.print(dataStream.consec(4)+" "); 
		System.out.print(dataStream.consec(4)+" "); 
		System.out.print(dataStream.consec(4)+" "); 
		System.out.print(dataStream.consec(3)+" ");
		
		
	}

}
