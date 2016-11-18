package bingyan.leetcode.solution;

import java.util.Arrays;

public class SuperPow {
	public static void main(String[] args) {
		new SuperPow().superPow(2, new int[]{1,0});
	}
	public int superPow(int a, int[] b) {
		if(isEqualOne(b))
			return a % 1337;
		
		boolean isOdd = isOdd(b);
		a %= 1337; 
		int v = superPow(a * a, dividedBy2(b));
		return isOdd ? v % 1337 : (a * v) % 1337;
	}
	private boolean isOdd(int[] arr) {
		return arr[arr.length - 1] % 2 == 0;
	}
	private boolean isEqualOne(int[] arr) {
		if(arr[arr.length - 1] != 1)
			return false;
		for(int i=0; i<arr.length-1; i++)
			if(arr[i] != 0)
				return false;
		return true;
	}
	private int[] dividedBy2(int[] arr) {
		int v = 0;
		for(int i=0; i<arr.length; i++) {
			boolean isOdd = (arr[i] + v) % 2 == 0;
			
			arr[i] = (arr[i] + v) / 2;
			v = isOdd ? 0 : 10;
		}
		return arr;
	}
}
