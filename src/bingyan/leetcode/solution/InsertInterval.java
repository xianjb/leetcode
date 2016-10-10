package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> list = new ArrayList<Interval>();
		for(Interval inter : intervals) {
			if(inter.end < newInterval.start)
				list.add(inter);
			else if(inter.start > newInterval.end) {
				list.add(newInterval);
				newInterval = inter;
			}
			else 
				newInterval = new Interval(Math.min(newInterval.start, inter.start), Math.max(inter.end, newInterval.end));
		}
		list.add(newInterval);
		return list;
	}
}
