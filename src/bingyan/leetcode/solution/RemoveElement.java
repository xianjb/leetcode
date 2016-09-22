package bingyan.leetcode.solution;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int index = 0;
        if(nums == null || nums.length == 0)
        		return index;
        for(int i=0; i<nums.length; i++)
        		if(nums[i] != val)
        			nums[index++] = nums[i];
        return index;
    }
}
