package bingyan.leetcode.solution;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int index = 0;
		int num = 1;
		for(int i=1; i<nums.length; i++) {
			if(nums[i] == nums[index])
				num++;
			else {
				num--;
				if(num == 0) {
					num = 1;
					i++;
					index = i;
				}
			}
		}
		return nums[index];
	}
}
