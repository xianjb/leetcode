package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
        		return list;
        if(root.left == null && root.right == null && root.val == sum) {
        		List<Integer> temp = new LinkedList<Integer>();
        		temp.add(root.val);
        		list.add(temp);
        		return list;
        }
        
        list.addAll(pathSum(root.left, sum - root.val));
        list.addAll(pathSum(root.right, sum - root.val));
        for(List<Integer> temp : list)
        		temp.add(0, root.val);
        return list;
    }
}
