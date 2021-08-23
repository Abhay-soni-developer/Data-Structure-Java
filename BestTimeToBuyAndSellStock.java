package recursion;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] arr = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
		if(prices.length==0) {
			return 0;
		}
		
		int maxProfit = 0;
		int smallestTillNow = prices[0];
		

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < smallestTillNow) {
				smallestTillNow = prices[i];
			}

			if ((prices[i] - smallestTillNow) > maxProfit) {
				maxProfit = prices[i] - smallestTillNow;
			}
		}

		return maxProfit;
	}

}
