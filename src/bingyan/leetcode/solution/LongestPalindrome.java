package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		if(s == null || s.isEmpty())
			return 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : s.toCharArray()) {
			Integer count = map.get(ch);
			count = count == null ? 0 : count;
			count++;
			map.put(ch, count);
		}
		
		int len = 0;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			len += entry.getValue() / 2 * 2;
		}
		return len == s.length() ? len : len + 1;
	}
}
