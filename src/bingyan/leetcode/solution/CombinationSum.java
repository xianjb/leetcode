package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
		Queue<Integer> indexs = new LinkedList<Integer>();
		Queue<Integer> sums = new LinkedList<Integer>();
		
		Arrays.sort(candidates);
		for(int i=0; i<candidates.length; i++) {
			List<Integer> tmp = new ArrayList<Integer>();
			tmp.add(candidates[i]);
			queue.add(tmp);
			indexs.add(i);
			sums.add(target - candidates[i]);
		}
		
		for(List<Integer> list=queue.poll(); list!=null; list=queue.poll()) {
			Integer sum = sums.poll();
			Integer index = indexs.poll();
			
			if(sum == 0)
				result.add(list);
			if(sum > 0) {
				for(int i=index; i<candidates.length; i++) {
					List<Integer> tmp = new ArrayList<Integer>(list);
					tmp.add(candidates[i]);
					queue.add(tmp);
					indexs.add(i);
					sums.add(sum - candidates[i]);
				}
			}
		}
		
		return result;
	}
}
