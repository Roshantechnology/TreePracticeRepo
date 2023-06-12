package in.ineuron;

import java.util.Arrays;

public class Fifth {

	 static long minValue(int nums1[], int nums2[], int n)
	    {
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        long result = 0;
	        for (int i = 0; i < n; i++)
	            result += (nums1[i] * nums2[n - i - 1]);
	 
	        return result;
	    }


	public static void main(String[] args) {
		int nums1[] = {5,3,4,2};
		int nums2[] = {4,2,2,5};
		int n=nums1.length;
		System.out.println(minValue(nums1, nums2, n));
	}

}
