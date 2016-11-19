package bingyan.leetcode.solution;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	/** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        if(stack.isEmpty()) {
        	stack.push(x);
        	min.push(x);
        }
        else {
        	stack.push(x);
        	min.push(Math.min(min.peek(), x));
        }
    }
    
    public void pop() {
        min.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
