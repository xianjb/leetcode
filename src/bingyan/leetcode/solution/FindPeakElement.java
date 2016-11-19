package bingyan.leetcode.solution;

public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		if(nums.length == 1)
			return 0;
		if(nums[0] > nums[1])
			return 0;
		if(nums[nums.length - 1] > nums[nums.length - 2])
			return nums.length - 1;
		for(int i=1, limit=nums.length-1; i<limit; i++)
			if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
				return i;
		throw new RuntimeException("null result");
	}
}
