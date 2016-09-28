package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		if(root == null)
			return new ArrayList<Integer>();
		List<Integer> list = postorderTraversal(root.left);
		list.addAll(postorderTraversal(root.right));
		list.add(root.val);
		return list;
	}
}
