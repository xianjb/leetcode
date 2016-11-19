package bingyan.leetcode.solution;

import java.util.Arrays;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		long[] arr = new long[3];
		Arrays.fill(arr, Long.MIN_VALUE);
		int repeatCount = 0;
		for(int v : nums) {
			if(v == arr[0] || v == arr[1] || v == arr[2]) {
				repeatCount++;
				continue;
			}
			if(v > arr[0]) {
				arr[2] = arr[1];
				arr[1] = arr[0];
				arr[0] = v;
			}
			else if(v > arr[1]) {
				arr[2] = arr[1];
				arr[1] = v;
			}
			else if(v > arr[2])
				arr[2] = v;
		}
		return nums.length - repeatCount >= 3 ? (int)arr[2] : (int)arr[0];
	}
}
