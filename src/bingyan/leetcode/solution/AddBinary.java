package bingyan.leetcode.solution;

public class AddBinary {
	public String addBinary(String a, String b) {
		int ai = a == null ? -1 : a.length() - 1;
		int bi = b == null ? -1 : b.length() - 1;
		
		String r = "";
		int v = 0;
		while(ai >= 0 || bi >= 0) {
			if(ai >= 0)
				v += a.charAt(ai--) - '0';
			if(bi >= 0)
				v += b.charAt(bi--) - '0';
			
			r = (v % 2 == 0 ? "0" : "1") + r;
			v /= 2;
		}
		while(v != 0) {
			r = (v % 2 == 0 ? "0" : "1") + r;
			v /= 2;
		}
		return r;
	}
}
