package bingyan.leetcode.solution;

public class FindTheDuplicateNumber {
	public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        for(int v : nums)
        		arr[v]++;
        for(int i=1; i<arr.length; i++)
        		if(arr[i] > 1)
        			return i;
        throw new RuntimeException("no valid result");
    }
}
