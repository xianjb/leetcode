package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		String[] arr = str.split(" ");
		if(pattern.length() != arr.length)
			return false;
		Map<Character, String> pmap = new HashMap<Character, String>();
		Map<String, Character> smap = new HashMap<String, Character>();
		for(int i=0; i<arr.length; i++) {
			char ch = pattern.charAt(i);
			
			String s = pmap.get(ch);
			Character c = smap.get(arr[i]);
			
			if(s == null && c == null) {
				pmap.put(ch, arr[i]);
				smap.put(arr[i], ch);
			}
			else if(s == null || c == null || c != ch || !s.equals(arr[i])) {
				return false;
			}
		}
		return true;
	}
}
