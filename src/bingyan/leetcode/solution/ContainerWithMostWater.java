package bingyan.leetcode.solution;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int r = 0;
		if(height == null || height.length < 2)
			return r;
		
		int left = 0;
		int right = height.length - 1;
		while(left < right) {
			int v = (right - left) * Math.min(height[left], height[right]);
			r = Math.max(r, v);
			if(height[left] <= height[right])
				left++;
			else
				right--;
		}
		return r;
	}
}
