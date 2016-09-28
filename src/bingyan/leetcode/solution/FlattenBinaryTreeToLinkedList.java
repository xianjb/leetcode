package bingyan.leetcode.solution;

public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
        if(root == null)
            return;
        if(root.left != null) {
            TreeNode right = root.right;
            TreeNode p = root.left;
            while(p.right != null) p = p.right;
            p.right = right;
        
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }
}
