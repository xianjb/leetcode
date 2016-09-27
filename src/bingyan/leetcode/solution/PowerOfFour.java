package bingyan.leetcode.solution;

public class PowerOfFour {
	public boolean isPowerOfFour(int num) {
        if(num == 1)
            return true;
        if(num < 4)
            return false;
        if(num % 4 != 0)
            return false;
        return isPowerOfFour(num / 4);
    }
}
