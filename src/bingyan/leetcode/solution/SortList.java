package bingyan.leetcode.solution;

public class SortList {
	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		
		ListNode pre = null;
		ListNode tail = null;
		
		int i = 0;
		while(head != null) {
			ListNode n = head.next;
			i++;
			if((i & 1) == 1) {
				head.next = pre;
				pre = head;
			}
			else {
				head.next = tail;
				tail = head;
			}
			head = n;
		}
		
		pre = sortList(pre);
		tail = sortList(tail);
		
		// merge
		ListNode result = null;
		ListNode tp = null;
		while(pre != null || tail != null) {
			ListNode node = null;
			if(pre == null) {
				node = tail;
				tail = tail.next;
			}
			else if(tail == null) {
				node = pre;
				pre = pre.next;
			}
			else if(pre.val > tail.val) {
				node = tail;
				tail = tail.next;
			}
			else {
				node = pre;
				pre = pre.next;
			}
			node.next = node;
			
			if(result == null) {
				result = tp = node;
			}
			else {
				tp.next = node;
				tp = node;
			}
		}
		
		return result;
	}
}
