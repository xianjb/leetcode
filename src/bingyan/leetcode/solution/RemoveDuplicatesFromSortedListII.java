package bingyan.leetcode.solution;

public class RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
			return head;
		if(head.val == head.next.val) {
			ListNode node = head.next.next;
			while(node != null && node.val == head.val)
				node = node.next;
			return deleteDuplicates(node);
		}
		head.next = deleteDuplicates(head.next);
		return head;
	}
}
