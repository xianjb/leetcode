package bingyan.leetcode.solution;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0)
			return 1;
		for(int i=0; i<nums.length; i++) {
			int v = nums[i];
			while(v > 0 && v <= nums.length && nums[v - 1] != v) {
				int t = nums[v - 1];
				nums[v - 1] = v;
				v = t;
			}
		}
		for(int i=0; i<nums.length; i++)
			if(nums[i] != i + 1)
				return i + 1;
		return nums.length + 1;
    }
}
