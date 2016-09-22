package bingyan.leetcode.solution;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode r = null;
		ListNode t = null;
		while(l1 != null || l2 != null) {
			ListNode node = null;
			if(l1 == null) {
				node = l2; l2 = l2.next;
			}
			else if(l2 == null) {
				node = l1; l1 = l1.next;
			}
			else if(l1.val <= l2.val) {
				node = l1; l1 = l1.next;
			}
			else {
				node = l2; l2 = l2.next;
			}
			node.next = null;
			if(r == null)
				r = t = node;
			else {
				t.next = node;
				t = node;
			}
		}
		return r;
	}
}
