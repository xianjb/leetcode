package bingyan.leetcode.solution;

public class MaximumXOROfTwoNumbersInAnArray {
	public static void main(String[] args) {
		System.out.println(findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}));
	}
	public static int findMaximumXOR(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		int num = 0;
		for(int i=1; i>0; i<<=1)
			num = i;
		
		int i = nums.length;
		while(i == nums.length) {
			i = 0;
			for(i=0; i<nums.length; i++)
				if((nums[i] & num) == num)
					break;
			num >>>= 1;
		}
		// num
		int counter = 0;
		for(int v : nums)
			if((v & num) == num)
				counter++;
		// split
		int[] arr = new int[counter];
		int[] can = new int[nums.length - counter];
		int ai = 0;
		int ci = 0;
		for(int v : nums) {
			if((v & num) == num)
				arr[ai++] = v;
			else
				can[ci++] = v;
		}
		// 求解
		int max = 0;
		for(int v1 : arr)
			for(int v2 : can)
				max = Math.max(max, v1 ^ v2);
		
		return max;
	}
}
