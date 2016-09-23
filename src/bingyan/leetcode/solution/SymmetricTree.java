package bingyan.leetcode.solution;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		Queue<TreeNode> left = new LinkedList<TreeNode>();
		Queue<TreeNode> right = new LinkedList<TreeNode>();
		left.add(root);
		right.add(root);
		for(TreeNode node=left.poll(); node!=null; node=left.poll()) {
			TreeNode rnode = right.poll();
			if(node.val != rnode.val)
				return false;
			if(node.left != null && rnode.right != null) {
				left.add(node.left);
				right.add(rnode.right);
			}
			
			int i = node.left == null ? 1 : 0;
			int n = rnode.right == null ? 1 : 0;
			if(i != n)
				return false;

			if(node.right != null && rnode.left != null) {
				left.add(rnode.left);
				right.add(node.right);
			}
			
			i = node.right == null ? 1 : 0;
			n = rnode.left == null ? 1 : 0;
			if(i != n)
				return false;
		}
		return true;
    }
}
