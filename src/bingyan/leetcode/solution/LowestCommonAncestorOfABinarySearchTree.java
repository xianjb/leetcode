package bingyan.leetcode.solution;

public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root.val == p.val || root.val == q.val)
			return root;
		if (root.val > Math.min(p.val, q.val)
				&& root.val < Math.max(p.val, q.val))
			return root;
		if (root.val < Math.min(p.val, q.val))
			return lowestCommonAncestor(root.right, p, q);
		return lowestCommonAncestor(root.left, p, q);
	}
}
