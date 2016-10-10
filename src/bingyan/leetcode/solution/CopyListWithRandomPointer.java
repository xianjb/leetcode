package bingyan.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null)
			return null;
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		for(RandomListNode node=head; node!=null; node=node.next) {
			RandomListNode n = copy(map, node);
			n.next = copy(map, node.next);
			n.random = copy(map, node.random);
		}
		return map.get(head);
	}
	private RandomListNode copy(Map<RandomListNode, RandomListNode> map, RandomListNode node) {
		if(node == null)
			return null;
		RandomListNode n = map.get(node);
		if(n == null) {
			n = new RandomListNode(node.label);
			map.put(node, n);
		}
		return n;
	}
}
