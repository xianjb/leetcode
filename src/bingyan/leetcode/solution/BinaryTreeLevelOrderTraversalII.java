package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root != null)
			queue.add(root);
		while(queue.peek() != null) {
			Queue<TreeNode> tmp = new LinkedList<TreeNode>();
			List<Integer> list = new ArrayList<Integer>();
			for(TreeNode node=queue.poll(); node!=null; node=queue.poll()) {
				list.add(node.val);
				if(node.left != null)
					tmp.add(node.left);
				if(node.right != null)
					tmp.add(node.right);
			}
			queue = tmp;
			result.add(0, list);
		}
		return result;
	}
}
