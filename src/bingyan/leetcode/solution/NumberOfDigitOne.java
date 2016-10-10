package bingyan.leetcode.solution;

public class NumberOfDigitOne {
	public int countDigitOne(int n) {
		if (n < 10)
			return n >= 1 ? 1 : 0;

		int mod = 10;
		while (n / mod > 9)
			mod *= 10;

		int v = n / mod == 1 ? ((n % mod) + 1) : 0;
		v += countDigitOne(n % mod);
		if(n / mod > 1)
			v += mod;
		
		v += n / mod * countDigitOne(mod - 1);
		return v;
	}
}
