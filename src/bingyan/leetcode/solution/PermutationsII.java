package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class PermutationsII {
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        List<Integer> list = new ArrayList<Integer>(nums.length);
        for(int i : nums)
            list.add(i);
            
        Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
        Queue<List<Integer>> lefts = new LinkedList<List<Integer>>();
        
        queue.add(new ArrayList<Integer>());
        lefts.add(list);
        
        for(List<Integer> ls=queue.poll(); ls!=null; ls=queue.poll()) {
            List<Integer> left = lefts.poll();
            if(left == null || left.isEmpty()) {
                result.add(ls);
            }
            else {
                Set<Integer> set = new HashSet<Integer>();
                for(int i=0; i<left.size(); i++) {
                    if(!set.add(left.get(i)))
                        continue;
                    List<Integer> tmp = new ArrayList<Integer>(left);
                    List<Integer> nls = new ArrayList<Integer>(ls);
                    nls.add(left.get(i));
                    tmp.remove(i);
                    queue.add(nls);
                    lefts.add(tmp);
                }
            }
        }
        return result;
    }
}
