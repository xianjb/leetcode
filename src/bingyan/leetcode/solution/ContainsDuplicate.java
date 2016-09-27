package bingyan.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length < 2)
            return false;
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums)
            if(!set.add(i))
                return true;
        return false;
    }
}
