package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		if(nums == null || nums.length < 1)
			return list;
		int s = nums[0];
		int e = s;
		for(int i=1; i<nums.length; i++) {
			if(nums[i] == (e + 1)) {
				e = nums[i];
			}
			else {
				list.add(s == e ? s + "" : s + "->" + e);
				s = e = nums[i];
			}
		}
		list.add(s == e ? s + "" : s + "->" + e);
		return list;
	}
}
