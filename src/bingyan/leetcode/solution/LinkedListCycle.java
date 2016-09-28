package bingyan.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        for(ListNode node=head; node!=null; node=node.next)
            if(!set.add(node))
                return true;
        return false;
    }
}
