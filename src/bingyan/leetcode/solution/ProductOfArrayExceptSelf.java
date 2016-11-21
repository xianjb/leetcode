package bingyan.leetcode.solution;

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		if(nums == null || nums.length <= 1)
			return nums;
		
		int mulProduct = 1;
		int zeroCount = 0;
		for(int v : nums)
			if(v == 0)
				zeroCount++;
			else
				mulProduct *= v;
		
		int[] arr = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			if(zeroCount > 1)
				arr[i] = 0;
			else if(zeroCount == 0) 
				arr[i] = mulProduct / nums[i];
			else if(nums[i] == 0) 
				arr[i] = mulProduct;
			else
				arr[i] = 0;
		}
		return arr;
	}
}
