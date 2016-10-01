package bingyan.leetcode.solution;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        if(n < 1)
            return false;
        int counter = 0;
        while(n > 0) {
            counter += (n & 1);
            n >>>= 1;
        }
        return counter == 1;
    }
}
