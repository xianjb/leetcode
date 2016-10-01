package bingyan.leetcode.solution;

public class RotateFunction {
	public int maxRotateFunction(int[] A) {
		int total = 0;
		int max = 0;
		for(int i=0; i<A.length; i++) {
			total += A[i];
			max += i * A[i];
		}
		int pre = max;
		for(int v : A) {
			pre = pre + A.length * v - total;
			max = Math.max(max, pre);
		}
		return max;
	}
}
