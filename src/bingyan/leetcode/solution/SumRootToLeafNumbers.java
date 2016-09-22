package bingyan.leetcode.solution;

import java.util.LinkedList;
import java.util.Queue;

public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> vs = new LinkedList<Integer>();
        if(root != null) {
        		queue.add(root);
        		vs.add(0);
        }
        for(TreeNode node=queue.poll(); node!=null; node=queue.poll()) {
        		Integer v = vs.poll();
        		v *= 10;
        		v += node.val;
        		if(node.left == null && node.right == null)
        			sum += v;
        		if(node.left != null) {
        			queue.add(node.left);
        			vs.add(v);
        		}
        		if(node.right != null) {
        			queue.add(node.right);
        			vs.add(v);
        		}
        }
        return sum;
    }
}
