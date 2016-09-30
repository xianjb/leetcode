package bingyan.leetcode.solution;

public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		if(nums == null)
			return 0;
		if(nums.length < 3)
			return nums.length;
		
		int index = 2;
		for(int i=2; i<nums.length; i++) {
			if(nums[i] == nums[index - 1] && nums[i] == nums[index - 2])
				continue;
			nums[index++] = nums[i]; 
		}
		return index;
	}
}
