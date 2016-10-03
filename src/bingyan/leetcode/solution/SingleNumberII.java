package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int v : nums) {
			Integer count = map.get(v);
			count = count == null ? 0 : count;
			count++;
			map.put(v, count);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
			if(entry.getValue() == 1)
				return entry.getKey();
		throw new RuntimeException();
	}
}
