package bingyan.leetcode.solution;

public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
        int r = nums[0];
        for(int i : nums)
            r = Math.min(r, i);
        return r;
    }
}
