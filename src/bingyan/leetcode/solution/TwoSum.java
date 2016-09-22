package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * @author bingyan
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
        		Integer index = map.get(target - nums[i]);
        		if(index != null)
        			return new int[]{index, i};
        		map.put(nums[i], i);
        }
        throw new RuntimeException("null valid result");
    }
}
