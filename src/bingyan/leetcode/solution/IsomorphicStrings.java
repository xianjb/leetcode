package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		if(s == null && t == null)
				return true;
		if(s == null || t == null || s.length() != t.length())
			return false;
		Map<Character, Character> smap = new HashMap<Character, Character>();
		Map<Character, Character> tmap = new HashMap<Character, Character>();
		for(int i=0; i<s.length(); i++) {
			char sch = s.charAt(i);
			char tch = t.charAt(i);
			Character sc = smap.get(sch);
			Character tc = tmap.get(tch);
			if(sc == null && tc == null) {
				smap.put(sch, tch);
				tmap.put(tch, sch);
			}
			else if(sc == null || tc == null || sc != tch || tc != sch) {
				return false;
			}
		}
		return true;
	}
}
