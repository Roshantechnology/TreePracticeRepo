package in.ineuron;

import java.util.LinkedList;
import java.util.Queue;

public class Fourth {
	   Queue<Integer> queue;

	    public Fourth() {
	        queue = new LinkedList<Integer>();
	    }
	    
	    public int ping(int t) {
	        queue.offer(t);
	        int time = t - queue.peek();
	        while(time > 3000) {
	            queue.poll();
	            time = t - queue.peek();
	        }
	        return queue.size();
	    }
	
	public static void main(String[] args) {
		Fourth recentCounter = new Fourth();
		recentCounter.ping(1);     
		recentCounter.ping(100);   
		recentCounter.ping(3001);
		recentCounter.ping(3002);
		System.out.println(recentCounter.queue.size());

	}

}
