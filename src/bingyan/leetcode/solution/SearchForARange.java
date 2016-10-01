package bingyan.leetcode.solution;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
		int min = 0;
		int max = nums.length - 1;
		while(min <= max) {
			int mid = (min + max) / 2;
			if(nums[mid] == target) {
				int left = mid;
				while(left > 0 && nums[left - 1] == target) left--;
				int right = mid;
				while(right < (nums.length - 1) && nums[right + 1] == target) right++;
				return new int[]{left, right};
			}
			else if(nums[mid] < target) 
				min = mid + 1;
			else
				max = mid - 1;
		}
		return new int[]{-1, -1};
	}
}
