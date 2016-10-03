package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class UglyNumberII {
	public int nthUglyNumber(int n) {
		List<Integer> list = new ArrayList<Integer>(n);
		list.add(1);
		
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		while(list.size() < n) {
			int v2 = list.get(i2) * 2;
			int v3 = list.get(i3) * 3;
			int v5 = list.get(i5) * 5;
			
			int min = Math.min(v2, v3);
			min = Math.min(v5, min);
			
			if(v2 == min) i2++;
			if(v3 == min) i3++;
			if(v5 == min) i5++;
			
			list.add(min);
		}
		return list.get(n - 1);
	}
}
