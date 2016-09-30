package bingyan.leetcode.solution;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int len = 0;
		for(ListNode node=head; node!=null; node=node.next)
			len++;
		if(len < 1)
			return head;
		n %= len;
		if(n == 0)
			return head.next;
		
		int i = 1;
		ListNode p = head;
		while(i + n < len) {
			p = p.next;
			i++;
		}
		p.next = p.next.next;
		return head;
	}
}
