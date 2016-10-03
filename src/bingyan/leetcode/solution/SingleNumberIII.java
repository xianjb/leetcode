package bingyan.leetcode.solution;

import java.util.Set;
import java.util.TreeSet;

public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		Set<Integer> set = new TreeSet<Integer>();
		for(int v : nums)
			if(!set.add(v))
				set.remove(v);
		int[] arr = new int[2];
		int index = 0;
		for(int v : set)
			arr[index++] = v;
		return arr;
	}
}
