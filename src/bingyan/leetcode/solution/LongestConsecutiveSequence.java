package bingyan.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		
		Set<Integer> set = new HashSet<Integer>();
		for(int v : nums) {
			set.add(v);
		}
		
		int r = 1;
		for(int v : nums) {
			if(!set.remove(v))
				continue;
			
			int len = 1;
			int uper = v + 1;
			while(set.remove(uper++))
				len++;
			int lower = v - 1;
			while(set.remove(lower--))
				len++;
			r = Math.max(r, len);
		}
		return r;
	}
}
