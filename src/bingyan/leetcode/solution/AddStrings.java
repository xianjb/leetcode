package bingyan.leetcode.solution;

public class AddStrings {
	public String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int i1 = num1.length() - 1;
		int i2 = num2.length() - 1;
		int v = 0;
		while(i1 >=0 || i2 >= 0) {
			v += i1 >= 0 ? num1.charAt(i1) - '0' : 0;
			v += i2 >= 0 ? num2.charAt(i2) - '0' : 0;
			
			sb.insert(0, v % 10);
			v /= 10;
			
			i1--;
			i2--;
		}
		while(v > 0) {
			sb.insert(0, v % 10);
			v /= 10;
		}
		return sb.toString();
	}
}
