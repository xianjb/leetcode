package bingyan.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0)
            return new int[0];
        if(nums2 == null || nums2.length == 0)
            return new int[0];
        Set<Integer> set = new HashSet<Integer>();
        for(int v : nums1)
            set.add(v);
        Set<Integer> r = new HashSet<Integer>();
        for(int v : nums2)
            if(set.contains(v))
                r.add(v);
        
        int[] arr = new int[r.size()];
        int index = 0;
        for(int v : r)
            arr[index++] = v;
        return arr;
    }
}
