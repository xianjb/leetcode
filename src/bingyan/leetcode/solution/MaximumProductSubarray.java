package bingyan.leetcode.solution;

public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int mi = nums[0];
		int ni = nums[0];

		int v = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == 0) {
				mi = nums[i];
				ni = nums[i];
				v = Math.max(v, nums[i]);
				continue;
			}

			int tm = mi * nums[i];
			int tn = ni * nums[i];

			v = Math.max(v, Math.max(tm, tn));
			mi = Math.max(mi, Math.max(tm, tn));
			ni = Math.min(ni, Math.min(tm, tn));
		}

		return v;
	}
}
