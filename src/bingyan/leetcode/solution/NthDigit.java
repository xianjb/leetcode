package bingyan.leetcode.solution;

public class NthDigit {
	public int findNthDigit(int n) {
		int i = 1;
		for (;;) {
			long next = i * 10L;
			if (next > Integer.MAX_VALUE)
				break;

			long step = (next - i) * (i + "").length();
			if (step >= n)
				break;
			n -= step;
			i = (int) next;
		}
		int len = (i + "").length();
		i += n / len;
		if (n % len == 0)
			i--;

		n %= len;
		if (n == 0)
			n = len;

		return Integer.parseInt((i + "").charAt(n - 1) + "");
	}
}
