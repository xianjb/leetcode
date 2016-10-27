package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
	public String minWindow(String s, String t) {
		Map<Character, Integer> allMap = new HashMap<Character, Integer>();
		for(int i=0; i<t.length(); i++)
			add(allMap, t.charAt(i), 1);
		System.out.println(allMap);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String result = "";
		int start = 0;
		add(map, s.charAt(0), 1);
		for(int i=1; i<s.length(); i++) {
			while(containAll(allMap, map)) {
				int len = result.length();
				if(len == 0 || len > (i - start)) 
					result = s.substring(start, i);
				add(map, s.charAt(start++), -1);
			}
			add(map, s.charAt(i), 1);
		}
		while(containAll(allMap, map)) {
			int len = result.length();
			if(len == 0 || len > (s.length() - start)) 
				result = s.substring(start);
			add(map, s.charAt(start++), -1);
		}
		return result;
    }
	private void add(Map<Character, Integer> map, char ch, int v) {
		Integer count = map.get(ch);
		count = count == null ? 0 : count;
		map.put(ch, count + v);
	}
	private boolean containAll(Map<Character, Integer> allMap, Map<Character, Integer> map) {
		for(Map.Entry<Character, Integer> entry : allMap.entrySet()) {
			Integer count = map.get(entry.getKey());
			if(count == null || count.intValue() < entry.getValue().intValue())
				return false;
		}
		return true;
	}
}
