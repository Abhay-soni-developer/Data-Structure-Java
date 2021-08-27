package recursion;


public class BestTimeToBuyAndSellStockWithCooldown {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,0,2 };
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
		int ss = 0;
		int cs = 0;

		int bs = prices[0];
		
		for (int i = 1; i < prices.length; i++) {
			int temp_bs = Math.min(bs, prices[i] - cs);
			cs = Math.max(ss, cs);
			ss = Math.max(ss, prices[i] - temp_bs);
			bs = temp_bs;
		}
		
		return Math.max(ss, cs);
	}
	

}
