package bingyan.leetcode.solution;

public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode p = null;
		ListNode t = null;
		int i = 1;
		for(ListNode node=head; node!=null; node=node.next) {
			if(i < m)
				p = node;
			if(i == n)
				t = node.next;
			i++;
		}
		
		ListNode node = p == null ? head : p.next;
		ListNode r = t;
		while(node != t) {
			ListNode next = node.next;
			node.next = r;
			r = node;
			node = next;
		}
		if(p == null)
			return r;
		p.next = r;
		return head;
	}
}
