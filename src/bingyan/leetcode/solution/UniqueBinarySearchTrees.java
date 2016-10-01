package bingyan.leetcode.solution;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		for(int i=1; i<=n; i++) {
			int tmp = 0;
			for(int index=1; index<=i; index++) {
				tmp += arr[index - 1] * arr[i - index];
			}
			arr[i] = tmp;
		}
		return arr[n];
	}
}
