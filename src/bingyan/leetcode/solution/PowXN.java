package bingyan.leetcode.solution;

public class PowXN {
	public double myPow(double x, int n) {
		if(n == 0)
			return 1;
		
		if(n == Integer.MIN_VALUE)
			return myPow(x * x, n / 2);
		
		if(n < 0) 
			return myPow(1 / x, -n);
		
		if(n == 1)
			return x;
		
		double v = myPow(x * x, n / 2);
		return n % 2 == 0 ? v : x * v;
	}
}
