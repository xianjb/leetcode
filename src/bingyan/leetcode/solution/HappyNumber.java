package bingyan.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		if(n < 1)
			return false;
		Set<Integer> set = new HashSet<Integer>();
		while(n != 1) {
			int tmp = 0;
			while(n != 0) {
				int v = n % 10;
				tmp += v * v;
				n /= 10;
			}
			n = tmp;
			if(!set.add(n))
				return false;
		}
		return n == 1;
	}
}
