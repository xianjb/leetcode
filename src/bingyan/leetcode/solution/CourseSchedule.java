package bingyan.leetcode.solution;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] arr = new int[numCourses];
		for(int[] pres : prerequisites)
			arr[pres[0]]++;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0; i<arr.length; i++)
			if(arr[i] == 0)
				queue.add(i);
		
		for(Integer i=queue.poll(); i!=null; i=queue.poll()) {
			for(int[] pres : prerequisites) 
				if(pres[1] == i.intValue()) {
					int count = --arr[pres[0]];
					if(count == 0)
						queue.add(pres[0]);
				}
		}
		for(int i : arr)
			if(i > 0)
				return false;
		return true;
	}
}
