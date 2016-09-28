package bingyan.leetcode.solution;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		if(root == null)
			return true;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Queue<Integer> min = new LinkedList<Integer>();
		Queue<Integer> max = new LinkedList<Integer>();
		
		queue.add(root);
		min.add(Integer.MIN_VALUE);
		max.add(Integer.MAX_VALUE);
		
		for(TreeNode node=queue.poll(); node!=null; node=queue.poll()) {
			Integer minv = min.poll();
			Integer maxv = max.poll();
			if(node.val < minv || node.val > maxv)
				return false;
			if(node.left != null) {
				if(node.val == Integer.MIN_VALUE)
					return false;
				queue.add(node.left);
				min.add(minv);
				max.add(node.val - 1);
			}
			if(node.right != null) {
				if(node.val == Integer.MAX_VALUE)
					return false;
				queue.add(node.right);
				min.add(node.val + 1);
				max.add(maxv);
			}
		}
		return true;
	}
}
