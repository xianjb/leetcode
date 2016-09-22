package bingyan.leetcode.solution;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if(head == null || head.next == null)
			return head;
		
        int len = 0;
        for(ListNode node=head; node!=null; node=node.next)
        		len++;
        
        k %= len;
        if(k == 0)
        		return head;
        
        int index = 1;
        ListNode p = head;
        while(index + k < len) {
        		index++;
        		p = p.next;
        }
        
        ListNode node = p.next;
        p.next = null;
        p = node; // switch
        while(p.next != null)
        		p = p.next;
        p.next = head;
        return node;
    }
}
