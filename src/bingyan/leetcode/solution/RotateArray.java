package bingyan.leetcode.solution;

import java.util.Arrays;

public class RotateArray {
	public void rotate(int[] nums, int k) {
        if(nums == null || nums.length < 2)
        		return;
        
        k %= nums.length;
        if(k == 0)
        		return;
        
        int[] temps = Arrays.copyOf(nums, nums.length - k);
        int index = 0;
        for(int i=nums.length - k; i<nums.length; i++)
        		nums[index++] = nums[i];
        for(int v : temps)
        		nums[index++] = v;
    }
}
