package bingyan.leetcode.solution;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * @author bingyan
 *
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int v = 0;
        while(l1 != null || l2 != null) {
        		if(l1 != null) {
        			v += l1.val;
        			l1 = l1.next;
        		}
        		if(l2 != null) {
        			v += l2.val;
        			l2 = l2.next;
        		}
        		ListNode node = new ListNode(v % 10);
        		v /= 10;
        		if(head == null)
        			head = tail = node;
        		else {
        			tail.next = node;
        			tail = node;
        		}
        }
        while(v > 0) {
	        	ListNode node = new ListNode(v % 10);
	    		v /= 10;
	    		if(head == null)
	    			head = tail = node;
	    		else {
	    			tail.next = node;
	    			tail = node;
	    		}
        }
        return head;
    }
}
