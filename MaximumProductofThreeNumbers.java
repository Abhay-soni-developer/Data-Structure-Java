package recursion;

public class MaximumProductofThreeNumbers {

	public static void main(String[] args) {
		int[] arr = { -5, 2, 3, 4 };
		System.out.println(maximumProduct(arr));
	}

	public static int maximumProduct(int[] nums) {
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE, thirdLargest = Integer.MIN_VALUE;
		int temp;
		int index1 = 0, index2 = 0, index3 = 0;

		for (int i = 0; i < nums.length; i++) {

			temp = modulus(nums[i]);

			if (temp > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = temp;

				index3 = index2;
				index2 = index1;
				index1 = i;

				continue;
			}

			if (temp > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = temp;

				index3 = index2;
				index2 = i;

				continue;
			}

			if (temp > thirdLargest) {
				thirdLargest = temp;

				index3 = i;
			}
		}

		return nums[index3] * nums[index2] * nums[index1];

	}

	public static int modulus(int n) {
		if (n < 0) {
			return n * -1;
		} else {
			return n;
		}
	}

}
