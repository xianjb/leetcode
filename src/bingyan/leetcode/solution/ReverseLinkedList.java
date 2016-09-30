package bingyan.leetcode.solution;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode r = reverseList(head.next);
		ListNode p = r;
		while(p.next != null) p = p.next;
		p.next = head;
		head.next = null;
		return r;
	}
}
