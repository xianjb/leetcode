package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DataStreamAsDisjointIntervals {
	TreeSet<Integer> set = new TreeSet<Integer>();
	/** Initialize your data structure here. */
    public DataStreamAsDisjointIntervals() {
        
    }
    
    public void addNum(int val) {
        set.add(val);
    }
    
    public List<Interval> getIntervals() {
        List<Interval> list = new ArrayList<Interval>();
        Interval inter = null;
        for(Integer ceil=set.first(); ceil!=null; ceil=set.ceiling(ceil + 1)) {
        	if(inter == null) {
        		inter = new Interval(ceil, ceil);
        		continue;
        	}
        	if(inter.end + 1 == ceil.intValue()) {
        		inter.end = ceil;
        		continue;
        	}
        	list.add(inter);
        	inter = new Interval(ceil, ceil);
        }
        list.add(inter);
        return list;
    }
}
