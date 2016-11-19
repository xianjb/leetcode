package bingyan.leetcode.solution;

import java.util.Stack;

public class Pattern132 {
	public boolean find132pattern(int[] nums) {
		if(nums == null || nums.length < 3)
			return false;
		
		Stack<Integer> min = new Stack<Integer>();
		Stack<Integer> max = new Stack<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(min.isEmpty() || nums[i] < nums[min.peek()]) {
				while(!min.isEmpty() && !max.isEmpty() && min.peek() > max.peek())
					min.pop();
				min.push(i);
			}
			else if(max.isEmpty() || max.peek() < min.peek() || nums[i] > nums[max.peek()]) {
				while(!min.isEmpty() && !max.isEmpty() && min.peek() < max.peek())
					max.pop();
				max.push(i);
			}
			else if(nums[i] == nums[min.peek()] || nums[i] == nums[max.peek()]) {
				continue;
			}
			else {
				return true;
			}
		}
		while(!max.isEmpty()) {
			int second = max.pop();
			if(max.isEmpty() || nums[second] >= nums[max.peek()])
				continue;
			while(!min.isEmpty() && min.peek() > max.peek())
				min.pop();
			if(nums[second] > nums[min.peek()])
				return true;
		}
		
		return false;
	}
}
