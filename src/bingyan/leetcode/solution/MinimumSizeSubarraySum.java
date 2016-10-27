package bingyan.leetcode.solution;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		int sum = nums[0];
		int index = 0;
		int len = Integer.MAX_VALUE;
		for(int i=1; i<nums.length; i++) {
			while(sum >= s) {
				len = Math.min(len, i - index);
				sum -= nums[index++];
			}
			sum += nums[i];
		}
		while(sum >= s) {
			len = Math.min(len, nums.length - index);
			sum -= nums[index++];
		}
		return len > nums.length ? 0 : len;
	}
}
