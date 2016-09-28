package bingyan.leetcode.solution;

public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
        if(n == 1)
            return true;
        if(n < 3)
            return false;
        if(n % 3 != 0)
            return false;
        return isPowerOfThree(n / 3);
    }
}
