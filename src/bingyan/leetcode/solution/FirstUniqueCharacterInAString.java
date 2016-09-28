package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : s.toCharArray()) {
			Integer counter = map.get(ch);
			counter = counter == null ? 0 : counter;
			counter++;
			map.put(ch, counter);
		}
		for(int i=0; i<s.length(); i++) {
			if(map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
}
