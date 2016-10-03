package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		
		Queue<String> queue = new LinkedList<String>();
		Queue<Integer> left = new LinkedList<Integer>();
		Queue<Integer> right = new LinkedList<Integer>();
		
		queue.add("");
		left.add(n);
		right.add(n);
		
		for(String str=queue.poll(); str!=null; str=queue.poll()) {
			int li = left.poll();
			int ri = right.poll();
			
			if(li > 0) {
				queue.add(str + "(");
				left.add(li - 1);
				right.add(ri);
			}
			if(ri > li) {
				queue.add(str + ")");
				left.add(li);
				right.add(ri - 1);
			}
			if(li == 0 && ri == 0)
				list.add(str);
		}
		return list;
	}
}
