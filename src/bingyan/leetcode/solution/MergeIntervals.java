package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals == null || intervals.isEmpty())
			return new ArrayList<Interval>();
		
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				int v = o1.start - o2.start;
				if(v == 0)
					v = o1.end - o2.end;
				return v;
			}
		});
		
		List<Interval> list = new ArrayList<Interval>();
		Interval interval = null;
		for(Interval inter : intervals) {
			if(interval == null) {
				interval = inter;
			}
			else if(inter.start > interval.end) {
				list.add(interval);
				interval = inter;
			}
			else {
				interval = new Interval(interval.start, Math.max(inter.end, interval.end));
			}
			
		}
		list.add(interval);
		return list;
	}
}
