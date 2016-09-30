package bingyan.leetcode.solution;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lena = 0;
		for(ListNode node=headA; node!=null; node=node.next) lena++;
		int lenb = 0;
		for(ListNode node=headB; node!=null; node=node.next) lenb++;
		
		while(lena > lenb) {headA = headA.next; lena--;}
		while(lena < lenb) {headB = headB.next; lenb--;}
		
		while(headA != null) {
			if(headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		
		return null;
	}
}
