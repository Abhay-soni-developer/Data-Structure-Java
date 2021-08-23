package recursion;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock2 {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,0,2 };
		System.out.println(maxProfit(arr));
	}

//	public static int maxProfit(int[] prices) {
//		int maxProfit = 0;
//		int currentHoldingQuantity = 0;
//		
//		for (int i = 0; i < prices.length - 1; i++) {
//			if (prices[i] > prices[i + 1] && currentHoldingQuantity == 1) {
//				maxProfit-=prices[i];
//				currentHoldingQuantity--;
//			} else if (prices[i] < prices[i + 1] && currentHoldingQuantity == 0) {
//				maxProfit+=prices[i];
//				currentHoldingQuantity++;
//			}
//		}
//		
//		if(currentHoldingQuantity==1) {
//			maxProfit-=prices[prices.length-1];
//		}
//
//		return maxProfit*-1;
//	}

	public static int maxProfit(int[] prices) {

		int maxprofit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			// subtracting today's price from the next day's price, gives the profit
			if (prices[i] < prices[i + 1])
				maxprofit += prices[i + 1] - prices[i];
		}
		return maxprofit;
	}

}
