package in.ineuron;

public class Third {
	    public static int missingNumber(int[] nums) {
	     int n = nums.length + 1;
	        int total = (n * (n-1 )) / 2; 
	        
	        for (int num : nums) {
	            total -= num;
	        }
	        
	        return total; 
	    }
	
		public static void main(String[] args)
		{
			int[] nums = {9,6,4,2,3,5,7,0,1};
			System.out.println(missingNumber(nums));
		}
	}
