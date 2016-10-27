package bingyan.leetcode.solution;

public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums == null || nums.length == 0)
			return new int[0];
        int[] arr = new int[nums.length - k + 1];
        int maxIndex = -1;
        int arrIndex = 0;
        for(int i=k-1; i<nums.length; i++) {
        	if(maxIndex + k <= i) {
        		maxIndex = i - k + 1;
        		for(int index=maxIndex; index<i; index++)
        			if(nums[index] >= nums[maxIndex])
        				maxIndex = index;
        	}
        	if(nums[maxIndex] <= nums[i])
        		maxIndex = i;
        	arr[arrIndex++] = nums[maxIndex];
        }
        return arr;
    }
}
