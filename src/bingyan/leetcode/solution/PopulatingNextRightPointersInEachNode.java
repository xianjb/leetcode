package bingyan.leetcode.solution;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
	public void connect(TreeLinkNode root) {
		if(root == null)
			return;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		
		while(queue.peek() != null) {
			Queue<TreeLinkNode> tmp = new LinkedList<TreeLinkNode>();
			for(TreeLinkNode node=queue.poll(); node!=null; node=queue.poll()) {
				node.next = queue.peek();
				if(node.left != null)
					tmp.add(node.left);
				if(node.right != null)
					tmp.add(node.right);
			}
			queue = tmp;
		}
	}
}
