package in.ineuron;
class Sixth {
	static int findMin(int nums[], int low, int high)
	{
		if (high < low)
			return nums[0];
		if (high == low)
			return nums[low];
		int mid
			= low + (high - low) / 2; 
		if (mid < high && nums[mid + 1] < nums[mid])
			return nums[mid + 1];
		if (mid > low && nums[mid] < nums[mid - 1])
			return nums[mid];
		if (nums[high] > nums[mid])
			return findMin(nums, low, mid - 1);
		return findMin(nums, mid + 1, high);
	}
	public static void main(String[] args)
	{
		int nums[] = {4,5,6,7,0,1,2};
		int N = nums.length;
		System.out.println(findMin(nums, 0, N - 1));
	}
}
