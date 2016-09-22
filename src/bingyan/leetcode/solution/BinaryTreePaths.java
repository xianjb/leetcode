package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
        if(root == null)
            return list;
        
        String str = "" + root.val;
        list.addAll(binaryTreePaths(root.left));
        list.addAll(binaryTreePaths(root.right));
        
        if(list.isEmpty()) {
        		list.add(str);
        }
        else {
        		List<String> temp = new ArrayList<String>(list.size());
        		str += "->";
        		for(String s : list)
        			temp.add(str + s);
        		list = temp;
        }
        return list;
    }
}
