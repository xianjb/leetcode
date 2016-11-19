package bingyan.leetcode.solution;

import java.util.Arrays;

public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		
		int count = 0;
		for(int v : s) {
			for(int i=0; i<g.length; i++) {
				if(g[i] <= v) {
					count++;
					g[i] = Integer.MAX_VALUE;
					break;
				}
			}
		}
		return count;
	}
}
