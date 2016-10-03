package bingyan.leetcode.solution;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
			return "";
		int index = 0;
		int limit = strs.length;
		while(limit >= strs.length) {
			limit = 0;
			for(String str : strs) {
				if(str == null || str.length() <= index)
					break;
				if(str.charAt(index) != strs[0].charAt(index))
					break;
				limit++;
			}
			if(limit >= strs.length)
				index++;
		}
		return strs[0].substring(0, index);
	}
}
