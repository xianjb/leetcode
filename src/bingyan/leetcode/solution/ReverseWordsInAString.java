package bingyan.leetcode.solution;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length - 1; i>=0; i--)
            if(!"".equals(arr[i]))
                sb.append(sb.length() == 0 ? "" : " ").append(arr[i]);
        return sb.toString();
    }
}
