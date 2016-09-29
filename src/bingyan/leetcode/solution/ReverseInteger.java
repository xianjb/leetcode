package bingyan.leetcode.solution;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	public static int reverse(int x) {
        if(x == Integer.MIN_VALUE || x == Integer.MAX_VALUE)
        	return 0;
		
        int flag = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int r = 0;
        while(x > 0) {
        	if(r * 10 / 10 != r)
        		return 0;
        	r *= 10;
        	r += x % 10;
        	x /= 10;
        }
        return flag * r;
    }
}
