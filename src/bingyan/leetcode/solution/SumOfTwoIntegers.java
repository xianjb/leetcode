package bingyan.leetcode.solution;

public class SumOfTwoIntegers {
	public int getSum(int a, int b) {
		String a2 = Integer.toBinaryString(a);
		String b2 = Integer.toBinaryString(b);
		
		int ia = a2.length() - 1;
		int ib = b2.length() - 1;
		char ch = '0';
		StringBuilder sb = new StringBuilder();
		while(ia >= 0 || ib >= 0) {
			int count = 0;
			
			if(ch == '1') count++;
			if(ia >= 0 && a2.charAt(ia--) == '1') count++;
			if(ib >= 0 && b2.charAt(ib--) == '1') count++;
			
			ch = count >= 2 ? '1' : '0';
			if(count == 1 || count == 3) 
				sb.append("1");
			else 
				sb.append("0");
		}
		if(ch == '1')
			sb.append("1");
		
		int v = 0;
		String str = sb.toString();
		for(int i=str.length() - 1; i>=0; i--) {
			v <<= 1;
			if(str.charAt(i) == '1')
				v++;
		}
		return v;
	}
}
