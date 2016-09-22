package bingyan.leetcode.solution;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		if(head == null)
			return head;
		ListNode node = removeElements(head.next, val);
		if(head.val == val)
			return node;
		head.next = node;
		return head;
    }
}
