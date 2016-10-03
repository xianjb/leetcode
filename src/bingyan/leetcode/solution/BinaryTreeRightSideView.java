package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if(root == null)
			return result;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(queue.peek() != null) {
			Queue<TreeNode> tmp = new LinkedList<TreeNode>();
			TreeNode n = null;
			for(TreeNode node=queue.poll(); node!=null; node=queue.poll()) {
				n = node;
				if(n.left != null)
					tmp.add(n.left);
				if(n.right != null)
					tmp.add(n.right);
			}
			result.add(n.val);
			queue = tmp;
		}
		return result;
	}
}
