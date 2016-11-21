package bingyan.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	Set<Integer> set = new HashSet<Integer>();
	public boolean wordBreak(String s, Set<String> wordDict) {
		if(s == null || s.isEmpty())
			return true;
		for(String str : wordDict) {
			if(s.length() < str.length())
				continue;
			int i = 0;
			while(i < str.length()) {
				if(str.charAt(i) != s.charAt(i))
					break;
				i++;
			}
			if(i == str.length() && set.add(s.length() - i) && wordBreak(s.substring(i), wordDict))
				return true;
		}
		return false;
	}
}
