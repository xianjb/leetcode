package bingyan.leetcode.solution;

import java.util.Stack;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2)
            return 0;
            
        int r = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(prices[0]);
        for(int i=1; i<prices.length; i++) {
            int v = stack.peek();
            if(v < prices[i])
                r = Math.max(prices[i] - v, r);
            else {
                stack.pop();
                stack.push(prices[i]);
            }
        }
        return r;
    }
}
