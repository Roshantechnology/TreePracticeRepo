package in.ineuron;

import java.util.ArrayList;
import java.util.List;

public class Sixth {
	  public List<Integer> findDuplicates(int[] nums) {
	        int n = nums.length;
	        int[] cs = new int[n+1];
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i = 0; i < n; i++){
	            cs[nums[i]] += 1;
	        }
	        for(int i = 0; i < cs.length; i++){
	            if(cs[i] == 2){
	                al.add(i);
	            }
	        }
	        return al;
	    }

	public static void main(String[] args) {
		int nums[]= {4,3,2,7,8,2,3,1};
		
		Sixth ob = new Sixth();
		List<Integer> findDuplicates = ob.findDuplicates(nums);
		System.out.println(findDuplicates);
		

	}

}
