package bingyan.leetcode.solution;

public class ReorderList {
	public void reorderList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null)
			return;
		
		ListNode slower = head, faster = head.next;
		while(faster.next != null && faster.next.next != null) {
			faster = faster.next.next;
			slower = slower.next;
		}
		
		ListNode tail = null;
		for(ListNode node=slower.next; node!=null; ) {
			ListNode n = node.next;
			node.next = tail;
			tail = node;
			node = n;
		}
		slower.next = null;
		
		ListNode pre = head.next;
		ListNode pointer = head;
		while(pre != null || tail != null) {
			if(tail != null) {
				pointer.next = tail;
				pointer = pointer.next;
				tail = tail.next;
			}
			if(pre != null) {
				pointer.next = pre;
				pointer = pointer.next;
				pre = pre.next;
			}
		}
	}
}
