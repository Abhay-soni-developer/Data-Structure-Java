package recursion;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] arr = { 11, -4, 2, 6, 4, 9, 5 };
		int length = 4;
		System.out.println(maxSumSubArray(arr, length));
	}

	public static int maxSumSubArray(int[] nums, int len) {
		int largest = Integer.MIN_VALUE;
		int sum = 0;
		int temp = 0;
		while (temp < len) {
			sum += nums[temp];
			temp++;
		}

		largest = sum;

		for (int j = 0, i = len; i < nums.length; i++, j++) {
			sum = sum - nums[j] + nums[i];
			if (sum > largest) {
				largest = sum;
			}
		}

		return largest;
	}

}
