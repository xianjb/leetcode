package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		if(s == null || s.length() == 0)
			return 0;
		
		int r = 1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int index = -1;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			Integer lastIndex = map.get(ch);
			lastIndex = lastIndex == null ? -1 : lastIndex;
			index = Math.max(index, lastIndex);
			r = Math.max(r, i - index);
			map.put(ch, i);
		}
		return r;
	}
}
