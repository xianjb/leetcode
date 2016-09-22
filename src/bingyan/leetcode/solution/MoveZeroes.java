package bingyan.leetcode.solution;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        if(nums == null || nums.length < 2)
        		return;
        int index = 0;
        for(int v : nums)
        		if(v != 0)
        			nums[index++] = v;
        while(index < nums.length) 
        		nums[index++] = 0;
    }
}
