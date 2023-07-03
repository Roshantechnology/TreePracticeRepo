package in.ineuron;

public class Second {
	public static int maxCircularSum(int nums[], int n)
	{
		if (n == 1)
		return nums[0];
		int sum = 0;
		for (int i = 0; i < n; i++) {
		sum += nums[i];
		}int curr_max = nums[0], max_so_far = nums[0],
		curr_min = nums[0], min_so_far = nums[0];
		for (int i = 1; i < n; i++)
		{
		curr_max = Math.max(curr_max + nums[i], nums[i]);
		max_so_far = Math.max(max_so_far, curr_max);
		curr_min = Math.min(curr_min + nums[i], nums[i]);
		min_so_far = Math.min(min_so_far, curr_min);
		}
		if (min_so_far == sum) {
		return max_so_far;
		}
		return Math.max(max_so_far, sum - min_so_far);
	}
	public static void main(String[] args)
	{
		int nums[] = { 5,-3,5};
		int n = nums.length;
		System.out.println("Maximum circular sum is "
						+ maxCircularSum(nums, n));
	}
	}
