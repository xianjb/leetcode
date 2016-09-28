package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
        	return new ArrayList<Integer>();
        List<Integer> list = inorderTraversal(root.left);
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}
