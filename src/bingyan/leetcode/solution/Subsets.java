package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> emptyList = new ArrayList<Integer>(0);
		result.add(emptyList);
		
		Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
		Queue<Integer> indexs = new LinkedList<Integer>();
		for(int i=0; i<nums.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(nums[i]);
			
			queue.add(list);
			indexs.add(i);
			
			result.add(list);
		}
		
		for(List<Integer> list=queue.poll(); list!=null; list=queue.poll()) {
			Integer index = indexs.poll();
			for(int i=index+1; i<nums.length; i++) {
				List<Integer> tmp = new ArrayList<Integer>(list);
				tmp.add(nums[i]);
				
				result.add(tmp);
				
				queue.add(tmp);
				indexs.add(i);
			}
		}
		return result;
	}
}
