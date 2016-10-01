package bingyan.leetcode.solution;

public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null)
			return 0;
		int left = 0;
		if(root.left != null && (root.left.left == null && root.left.right == null))
		    left = root.left.val;
		else
		    left = sumOfLeftLeaves(root.left);
		return left + sumOfLeftLeaves(root.right);
	}
}
