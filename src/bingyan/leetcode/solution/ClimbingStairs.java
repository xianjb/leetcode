package bingyan.leetcode.solution;

public class ClimbingStairs {
	public int climbStairs(int n) {
		int[] arr = new int[n];
		int index = n - 1;
		for(int i=1; i<=2 && index >= 0; i++)
			arr[index--] = i;
		for(;index >= 0; index--) 
			arr[index] = arr[index + 1] + arr[index + 2];
		return arr[0];
	}
}
