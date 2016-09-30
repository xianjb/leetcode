package bingyan.leetcode.solution;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int left = 0;
		int right = s.length() - 1;
		while(left < right) {
			if(s.charAt(left++) != s.charAt(right--))
				return false;
		}
		return true;
	}
}
