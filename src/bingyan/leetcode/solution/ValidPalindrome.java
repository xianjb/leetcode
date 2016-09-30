package bingyan.leetcode.solution;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == null || s.isEmpty())
			return true;
		s = s.toLowerCase();
		int left = 0;
		int right = s.length() - 1;
		while(left < right) {
			while(left < right && !isNeedJudge(s.charAt(left))) left++;
			while(left < right && !isNeedJudge(s.charAt(right))) right--;
			if(left < right && s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	private boolean isNeedJudge(char ch) {
		if ('0' <= ch && ch <= '9')
			return true;
		if ('a' <= ch && ch <= 'z')
			return true;
		return false;
	}
}
