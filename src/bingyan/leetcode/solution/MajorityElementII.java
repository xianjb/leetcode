package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
	public List<Integer> majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int v : nums) {
			Integer counter = map.get(v);
			counter = counter == null ? 0 : counter;
			counter++;
			map.put(v, counter);
		}
		List<Integer> list = new ArrayList<Integer>(2);
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
			if(entry.getValue() > nums.length / 3)
				list.add(entry.getKey());
		return list;
	}
}
