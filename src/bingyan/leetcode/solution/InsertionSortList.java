package bingyan.leetcode.solution;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		ListNode h = null;
		while(head != null) {
			ListNode n = head.next;
			
			if(h == null || head.val <= h.val) {
				head.next = h;
				h = head;
			}
			else {
				ListNode p = h;
				while(p.next != null && p.next.val < head.val)
					p = p.next;
				head.next = p.next;
				p.next = head;
			}
			
			head = n;
		}
		return h;
	}
}
