package bingyan.leetcode.solution;

public class ReverseNodesInkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode p = null;
		final int t = k;
		for(ListNode node=head; node!=null; node=node.next) {
			if(k > 0)
				p = node;
			if(k == 0)
				break;
			k--;
		}
		if(k > 0)
			return head;
		
		ListNode tail = reverseKGroup(p.next, t);
		p.next = tail;
		p = tail;
		while(head != tail) {
			ListNode n = head.next;
			head.next = p;
			p = head;
			head = n;
		}
		return p;
	}
}
