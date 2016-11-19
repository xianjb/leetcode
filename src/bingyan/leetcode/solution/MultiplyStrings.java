package bingyan.leetcode.solution;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		String[] muls = getMulValue(num1);
		String[] values = new String[num2.length()];
		for(int i=0; i<num2.length(); i++) {
			values[i] = muls[num2.charAt(i) - '0'];
			if(!values[i].equals("0"))
				for(int j=i+1; j<num2.length(); j++) 
					values[i] += "0";	
		}
		for(int i=1; i<values.length; i++)
			values[0] = add(values[0], values[i]);
		return values[0];
	}
	private String[] getMulValue(String str) {
		String[] arr = new String[10];
		arr[0] = "0";
		arr[1] = str;
		for(int i=2; i<10; i++)
			arr[i] = add(arr[i - 1], arr[1]);
		return arr;
	}
	private String add(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		int i1 = str1.length() - 1;
		int i2 = str2.length() - 1;
		int v = 0;
		while(i1 >= 0 || i2 >= 0) {
			v += i1 >= 0 ? str1.charAt(i1) - '0' : 0;
			v += i2 >= 0 ? str2.charAt(i2) - '0' : 0;
			
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
