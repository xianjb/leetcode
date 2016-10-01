package bingyan.leetcode.solution;

import java.util.Stack;

public class KthSmallestElementInABST {
	public int kthSmallest(TreeNode root, int k) {
		int index = 1;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(stack.peek().left != null) stack.push(stack.peek().left);
		
		while(index < k) {
			TreeNode node = stack.pop();
			if(node.right != null) {
				stack.push(node.right);
				while(stack.peek().left != null) stack.push(stack.peek().left);
			}
			index++;
		}
		return stack.peek().val;
	}
}
