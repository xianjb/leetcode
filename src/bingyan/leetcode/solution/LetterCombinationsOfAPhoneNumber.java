package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();
		if(digits == null || digits.isEmpty())
			return list;
		list.add("");
		for(int i=0; i<digits.length(); i++) {
			List<String> tmp = null;
			char ch = digits.charAt(i);
			if(ch == '2')
				tmp = get(list, "abc");
			else if(ch == '3')
				tmp = get(list, "def");
			else if(ch == '4')
				tmp = get(list, "ghi");
			else if(ch == '5')
				tmp = get(list, "jkl");
			else if(ch == '6')
				tmp = get(list, "mno");
			else if(ch == '7')
				tmp = get(list, "pqrs");
			else if(ch == '8')
				tmp = get(list, "tuv");
			else if(ch == '9')
				tmp = get(list, "wxyz");
			list = tmp;
		}
		return list;
	}
	private List<String> get(List<String> list, String str) {
		List<String> tmp = new ArrayList<String>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			for(String s : list)
				tmp.add(s + ch);
		}
		return tmp;
	}
}
