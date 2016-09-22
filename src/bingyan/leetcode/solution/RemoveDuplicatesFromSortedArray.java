package bingyan.leetcode.solution;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums == null)
			return 0;
		if(nums.length < 2)
			return nums.length;
		int index = 1;
		for(int i=1; i<nums.length; i++)
			if(nums[i] == nums[i - 1])
				continue;
			else
				nums[index++] = nums[i];
		return index;
	}
}
