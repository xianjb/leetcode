package bingyan.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int v : nums) 
			if(!set.add(v))
				set.remove(v);
		for(int v : set)
			return v;
		throw new RuntimeException("no valid result");
    }
}
