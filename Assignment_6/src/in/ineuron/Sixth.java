package in.ineuron;

import java.util.Arrays;
import java.util.HashMap;

public class Sixth {
	    public static int[] findOriginalArray(int[] changed) {
	       int[] vacarr = new int[0];
	        int n= changed.length;
	        if(n%2!=0)
	        {
	            return vacarr;
				}
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
				 int[] ans = new int[(changed.length/2)];
	        for(int i=0;i<n;i++)
	        {
	            hm.put(changed[i], hm.getOrDefault(changed[i],0)+1);
				 }
	        int temp = 0;
	        
	        Arrays.sort(changed);
			for(int i: changed)
	        {
	           
	            if(hm.get(i)<=0)
	            {
				    continue;
	            }
	         
	            if(hm.getOrDefault(2*i,0)<=0)
	            {   return vacarr;
	            }
	            ans[temp++] = i;
				 hm.put(i, hm.get(i)-1); 
	            hm.put(2*i, hm.get(2*i)-1);
	        }
	        
	        return ans;
	    }
	
	public static void main(String[] args) {
		int changed[] = {1,3,4,2,6,8};
		System.out.println(Arrays.toString(findOriginalArray(changed)));
	}

}
