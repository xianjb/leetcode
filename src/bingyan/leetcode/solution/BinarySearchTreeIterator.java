package bingyan.leetcode.solution;

import java.util.Stack;

public class BinarySearchTreeIterator {
	TreeNode root;
	Stack<TreeNode> stack;
	public BinarySearchTreeIterator(TreeNode root) {
		this.root = root;
		this.stack = new Stack<TreeNode>();
		if(this.root != null) {
			stack.push(root);
			while(stack.peek().left != null)
				stack.push(stack.peek().left);
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = stack.pop();
		if(node.right != null) {
			stack.push(node.right);
			while(stack.peek().left != null)
				stack.push(stack.peek().left);
		}
		return node.val;
	}
}
