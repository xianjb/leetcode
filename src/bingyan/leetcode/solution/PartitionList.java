package bingyan.leetcode.solution;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode lessHead = null, lessTail = null;
		ListNode moreHead = null, moreTail = null;
		for(ListNode node=head; node!=null; node=node.next) {
			if(node.val < x) {
				if(lessHead == null)
					lessHead = lessTail = node;
				else {
					lessTail.next = node;
					lessTail = lessTail.next;
				}
			}
			else {
				if(moreHead == null)
					moreHead = moreTail = node;
				else {
					moreTail.next = node;
					moreTail = moreTail.next;
				}
			}
		}
		if(moreTail != null)
			moreTail.next = null;
		if(lessTail == null)
			return moreHead;
		lessTail.next = moreHead;
		return lessHead;
	}
}
