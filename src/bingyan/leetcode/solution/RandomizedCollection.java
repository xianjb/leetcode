package bingyan.leetcode.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomizedCollection {
	Random random = new Random();
	List<Integer> list = new ArrayList<Integer>();
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        list.add(val);
        for(int i=0; i<list.size() - 1; i++)
            if(list.get(i) == val)
                return true;
        return false;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        for(Iterator<Integer> iterator=list.iterator(); iterator.hasNext(); ) {
            Integer v = iterator.next();
            if(v == val) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
		return list.get(random.nextInt(list.size()));
    }
}
