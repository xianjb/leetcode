package bingyan.leetcode.solution;

public class AddDigits {
	public int addDigits(int num) {
		while(num > 9) {
			int tmp = 0;
			while(num != 0) {
				tmp += num % 10;
				num /= 10;
			}
			num = tmp;
		}
		return num;
	}
}
