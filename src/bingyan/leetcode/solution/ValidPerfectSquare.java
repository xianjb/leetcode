package bingyan.leetcode.solution;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
		if(num < 1)
			return false;
		
		int min = 1;
		int max = Math.min(100000000, num);
		while(min <= max) {
			int mid = (min + max) / 2;
			long v = 1L * mid * mid;
			if(v > num) 
				max = mid - 1;
			else if(v < num)
				min = mid + 1;
			else
				return true;
		}
		return false;
	}
}
