package bingyan.leetcode.solution;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		if(s == null || s.isEmpty())
			return true;
		if(s.length() % 2 == 1)
			return false;
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{')
				stack.push(ch);
			if(stack.empty())
				return false;
			if(ch == ')' && stack.pop() != '(')
				return false;
			if(ch == ']' && stack.pop() != '[')
				return false;
			if(ch == '}' && stack.pop() != '{')
				return false;
		}
		return stack.empty();
	}
}
