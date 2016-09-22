package bingyan.leetcode.solution;


public class MissingNumber {
	public int missingNumber(int[] nums) {
		if(nums == null || nums.length == 0)
			return 1;
		for(int i=0; i<nums.length; i++) {
			int v = nums[i];
			while(v >= 0 && v < nums.length && nums[v] != v) {
				int t = nums[v];
				nums[v] = v;
				v = t;
			}
		}
		for(int i=0; i<nums.length; i++)
			if(nums[i] != i)
				return i;
		return nums.length;
    }
}
