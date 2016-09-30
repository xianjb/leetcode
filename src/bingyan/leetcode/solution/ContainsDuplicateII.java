package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			Integer index = map.get(nums[i]);
			if(index != null && (i - index) <= k)
				return true;
			map.put(nums[i], i);
		}
		return false;
	}
}
