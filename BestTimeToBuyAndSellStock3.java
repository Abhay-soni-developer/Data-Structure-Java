package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BestTimeToBuyAndSellStock3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 };
		System.out.println(maxProfit(arr));

	}

	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int[] fwdDir = maxProfitInSignleTransactionForwardDirection(prices);
		int[] bkdDir = maxProfitInSignleTransactionBackwardDirection(prices);

		for (int i = 0; i < prices.length; i++) {
			maxProfit = Math.max(maxProfit, fwdDir[i] + bkdDir[i]);
		}

		return maxProfit;
	}

	public static int[] maxProfitInSignleTransactionForwardDirection(int[] prices) {

		int[] maxProfitInEachPart = new int[prices.length];
		int maxProfit = 0;
		int smallestTillNow = prices[0];

		if (prices.length == 0) {
			return maxProfitInEachPart;
		}

		for (int i = 0; i < prices.length; i++) {
			smallestTillNow = Math.min(smallestTillNow, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - smallestTillNow);
			maxProfitInEachPart[i] = maxProfit;
		}

		return maxProfitInEachPart;
	}

	public static int[] maxProfitInSignleTransactionBackwardDirection(int[] prices) {

		int[] maxProfitInEachPart = new int[prices.length];
		int maxProfit = 0;

		int biggestTillNow = prices[prices.length - 1];

		if (prices.length == 0) {
			return maxProfitInEachPart;
		}

		for (int i = prices.length - 1; i >= 0; i--) {
			biggestTillNow = Math.max(biggestTillNow, prices[i]);
			maxProfit = Math.max(maxProfit, biggestTillNow - prices[i]);
			maxProfitInEachPart[i] = maxProfit;
		}

		return maxProfitInEachPart;
	}

}
