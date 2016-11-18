package bingyan.leetcode.solution;

public class SqrtX {
	public int mySqrt(int x) {
        int min = 1;
        int max = Math.min(x, 10000000);
        
        int r = 0;
        while(min <= max) {
        	int mid = (min + max) / 2;
        	long v = 1L * mid * mid;
        	if(v > x) 
        		max = mid - 1;
        	else if(v < x) {
        		r = mid;
        		min = mid + 1;
        	}
        	else
        		return mid;
        }
        return r;
    }
}
