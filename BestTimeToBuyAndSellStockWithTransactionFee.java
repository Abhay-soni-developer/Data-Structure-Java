package recursion;

public class BestTimeToBuyAndSellStockWithTransactionFee {

	public static void main(String[] args) {		
		int[] arr = {4,5,2,4,3,3,1,2,5,4 };
		System.out.println(maxProfit(arr, 1));
	}

//	public static int maxProfit(int[] prices, int fee) {
//		int[] bs = new int[prices.length];
//		int[] ss = new int[prices.length];
//
//		bs[0] = prices[0];
//
//		for (int i = 1; i < prices.length; i++) {
//			int newBs = prices[i] - ss[i - 1];
//			int newSs = prices[i] - bs[i - 1] - fee;
//
//			if (newBs < bs[i-1]) {
//				bs[i] = newBs;
//			}else {
//				bs[i]=bs[i-1];
//			}
//
//			if (newSs > ss[i - 1]) {
//				ss[i] = newSs;
//			}else {
//				ss[i]=ss[i-1];
//			}
//		}
//
//		return ss[prices.length - 1];
//	}
	
	
	public static int maxProfit(int[] prices, int fee) {
		int bs = -prices[0];
		int ss = 0;

		for (int i = 1; i < prices.length; i++) {
			int temp=bs;
			bs = Math.max(bs, -prices[i] + ss);
			ss = Math.max(ss, prices[i]+temp-fee);
		}

		return ss;
	}

}
