package in.ineuron;

import java.util.Arrays;

public class Third {
	    public int[] sortedSquares(int[] nums) {
	        for(int i=0;i<nums.length;i++){
	            nums[i] = nums[i]*nums[i];
	        }
	        Arrays.sort(nums);
	        return nums;
	    }
	public static void main(String[] args) {
		int nums []= {-4,-1,0,3,10};
		Third sixth = new Third();
		int[] sortedSquares = sixth.sortedSquares(nums);
		System.out.println(Arrays.toString(sortedSquares));

	}

}
