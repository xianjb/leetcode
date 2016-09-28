package bingyan.leetcode.solution;

public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode nextNode = swapPairs(head.next.next);
        ListNode result = head.next;
        head.next = nextNode;
        result.next = head;
        return result;
    }
}
