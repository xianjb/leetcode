package bingyan.leetcode.solution;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
			return head;
		while(head.next != null && head.next.val == head.val)
			head.next = head.next.next;
		head.next = deleteDuplicates(head.next);
		return head;
	}
}
