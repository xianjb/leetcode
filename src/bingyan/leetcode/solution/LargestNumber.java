package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public String largestNumber(int[] nums) {
		if(nums == null)
			return "";
		
		List<Integer> list = new ArrayList<Integer>(nums.length);
		for(int v : nums)
			list.add(v);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o2.intValue()+""+o1.intValue()).compareTo(o1.intValue()+""+o2.intValue());
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(Integer i : list)
			sb.append(i);
		String str = sb.toString();
		int index = 0;
		while(index + 1 < str.length() && str.charAt(index) == '0')
			index++;
		return index == 0 ? str : str.substring(index);
	}
}
