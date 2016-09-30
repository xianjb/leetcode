package bingyan.leetcode.solution;

import java.util.Stack;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		Stack<ListNode> stack = new Stack<ListNode>();
		for(ListNode node=head; node!=null; node=node.next)
			stack.push(node);
		for(ListNode node=head; node!=null; node=node.next) {
			ListNode n = stack.pop();
			if(node == n)
				break;
			if(node.val != n.val)
				return false;
		}
		return true;
	}
}
