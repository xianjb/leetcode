package bingyan.leetcode.solution;

import java.util.Stack;

public class AddTwoNumbersII {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<ListNode> stack1 = new Stack<ListNode>();
		for(ListNode node=l1; node!=null; node=node.next)
			stack1.push(node);
		Stack<ListNode> stack2 = new Stack<ListNode>();
		for(ListNode node=l2; node!=null; node=node.next)
			stack2.push(node);
		
		ListNode r = null;
		int v = 0;
		while(!stack1.isEmpty() || !stack2.isEmpty()) {
			if(!stack1.isEmpty()) 
				v += stack1.pop().val;
			if(!stack2.isEmpty())
				v += stack2.pop().val;
			ListNode node = new ListNode(v % 10);
			v /= 10;
			node.next = r;
			r = node;
		}
		while(v > 0) {
			ListNode node = new ListNode(v % 10);
			v /= 10;
			node.next = r;
			r = node;
		}
		return r;
	}
}
