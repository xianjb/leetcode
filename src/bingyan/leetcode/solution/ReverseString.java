package bingyan.leetcode.solution;

public class ReverseString {
	public String reverseString(String s) {
		if(s == null || s.isEmpty())
			return s;
		
		char[] arr = s.toCharArray();
		int li = 0;
		int ri = arr.length - 1;
		while(li < ri) {
			char t = arr[li];
			arr[li] = arr[ri];
			arr[ri] = t;
			li++;
			ri--;
		}
		return new String(arr);
	}
}
