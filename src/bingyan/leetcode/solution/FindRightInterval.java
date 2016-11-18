package bingyan.leetcode.solution;

import java.util.Arrays;

public class FindRightInterval {
	public int[] findRightInterval(Interval[] intervals) {
		int[] arr = new int[intervals.length];
		Arrays.fill(arr, -1);

		int[] indexs = new int[intervals.length];
		for (int i = 1; i < intervals.length; i++)
			indexs[i] = i;

		// insert sort
		for (int i = 1; i < intervals.length; i++) {
			Interval insert = intervals[i];
			int insertIndex = i;
			int index = i;
			while (index > 0 && intervals[index - 1].start > insert.start) {
				intervals[index] = intervals[index - 1];
				indexs[index] = indexs[index - 1];
				index--;
			}
			intervals[index] = insert;
			indexs[index] = insertIndex;
		}

		// find result
		for (int i = 0; i < intervals.length; i++) {
			for (int j = i + 1; j < intervals.length; j++) {
				if (intervals[j].start >= intervals[i].end) {
					arr[indexs[i]] = indexs[j];
					break;
				}
			}
		}
		return arr;
	}
}
