package in.ineuron;

public class Second {
		static int findPeakElement(
			int nums[], int low, int high, int n){
			
			int mid = low + (high - low) / 2;	
			if ((mid == 0 || nums[mid - 1] <= nums[mid])
				&& (mid == n - 1 || nums[mid + 1] <= nums[mid]))
				return mid;
			else if (mid > 0 && nums[mid - 1] > nums[mid])
				return findPeakElement(nums, low, (mid - 1), n);
			else
				return findPeakElement(
					nums, (mid + 1), high, n);
		}
		static int findPeak(int nums[], int n)
		{
			return findPeakElement(nums, 0, n - 1, n);
		}
		public static void main(String[] args)
		{
			int nums[] = {1,2,1,3,5,6,4};
			int n = nums.length;
			System.out.println(
				"Index of a peak point is " + findPeak(nums, n));
		}
	}
