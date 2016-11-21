package bingyan.leetcode.solution;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null)
			return head;
		
		ListNode oddPre = null, oddTail = null;
		ListNode evenPre = null, evenTail = null;
		oddPre = oddTail = head;
		evenPre = evenTail = head.next;
		
		boolean isOdd = true;
		for(ListNode node=head.next.next; node!=null; node=node.next) {
			if(isOdd) {
				oddTail.next = node;
				oddTail = node;
			}
			else {
				evenTail.next = node;
				evenTail = node;
			}
			isOdd = !isOdd;
		}
		oddTail.next = evenPre;
		evenTail.next = null;
		return oddPre;
	}
}
