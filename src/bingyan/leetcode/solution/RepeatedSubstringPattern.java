package bingyan.leetcode.solution;

public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String str) {
		for(int i=1; i<str.length(); i++) {
			if(str.length() % i == 0 && str.replaceAll(str.substring(0, i), "").isEmpty())
				return true;
		}
		return false;
	}
}
