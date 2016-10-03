package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null)
			queue.add(root);
		
		int index = 0;
		while (queue.peek() != null) {
			Queue<TreeNode> tmp = new LinkedList<TreeNode>();
			List<Integer> list = new ArrayList<Integer>();
			for (TreeNode node = queue.poll(); node != null; node = queue.poll()) {
				if(index % 2 == 0)
					list.add(node.val);
				else
					list.add(0, node.val);
				if (node.left != null)
					tmp.add(node.left);
				if (node.right != null)
					tmp.add(node.right);
			}
			queue = tmp;
			result.add(list);
			index++;
		}
		return result;
	}
}
