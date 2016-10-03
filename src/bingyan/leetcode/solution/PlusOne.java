package bingyan.leetcode.solution;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int v = 1;
		for(int i=digits.length - 1; i>=0; i--) {
			v += digits[i];
			digits[i] = v % 10;
			v /= 10;
		}
		if(v == 0)
			return digits;
		int[] arr = new int[digits.length + 1];
		arr[0] = v;
		for(int i=0; i<digits.length; i++)
			arr[i + 1] = digits[i];
		return arr;
	}
}
