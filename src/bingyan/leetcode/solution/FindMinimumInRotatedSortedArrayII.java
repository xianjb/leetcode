package bingyan.leetcode.solution;

public class FindMinimumInRotatedSortedArrayII {
	public int findMin(int[] nums) {
        int min = nums[0];
        for(int i : nums)
            min = Math.min(i, min);
        return min;
    }
}
