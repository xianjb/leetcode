package bingyan.leetcode.solution;

public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length < 2)
			return 0;
		
		int v = 0;
		for(int i=0; i<prices.length; i++) {
			int buyValue = prices[i];
			while(i + 1 < prices.length && prices[i + 1] <= buyValue)
				buyValue = prices[++i];
			
			if(i + 1 >= prices.length)
				break;
			
			int saleValue = prices[++i];
			while(i + 1 < prices.length && prices[i + 1] >= saleValue)
				saleValue = prices[++i];
			
			v += saleValue - buyValue;
		}
		return v;
	}
}
