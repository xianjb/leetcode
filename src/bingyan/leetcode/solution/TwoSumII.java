package bingyan.leetcode.solution;

public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		final int limit = target >>> 1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > limit)
				break;
			int r = find(numbers, i + 1, numbers.length - 1, target
					- numbers[i]);
			if (r > 0)
				return new int[] { i + 1, r };
		}
		return null;
	}

	private int find(int[] numbers, int start, int end, int target) {
		int s = start;
		int e = end;
		while (s <= e) {
			int mid = (s + e) >>> 1;
			if (numbers[mid] > target)
				e = mid - 1;
			else if (numbers[mid] < target)
				s = mid + 1;
			else
				return mid + 1;
		}
		return -1;
	}
}
