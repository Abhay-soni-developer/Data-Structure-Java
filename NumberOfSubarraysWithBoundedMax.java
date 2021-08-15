package recursion;

import java.util.Arrays;

public class NumberOfSubarraysWithBoundedMax {

	public static void main(String[] args) {

//		int[] arr = { 876, 880, 482, 260, 132, 421, 732, 703, 795, 420, 871, 445, 400, 291, 358, 589, 617, 202, 755,
//				810, 227, 813, 549, 791, 418, 528, 835, 401, 526, 584, 873, 662, 13, 314, 988, 101, 299, 816, 833, 224,
//				160, 852, 179, 769, 646, 558, 661, 808, 651, 982, 878, 918, 406, 551, 467, 87, 139, 387, 16, 531, 307,
//				389, 939, 551, 613, 36, 528, 460, 404, 314, 66, 111, 458, 531, 944, 461, 951, 419, 82, 896, 467, 353,
//				704, 905, 705, 760, 61, 422, 395, 298, 127, 516, 153, 299, 801, 341, 668, 598, 98, 241 };

		int[] arr = { 40, 63, 87, 86, 94};
		System.out.println(numSubarrayBoundedMax(arr, 11, 93));
		
	}

//	public static int numSubarrayBoundedMax(int[] nums, int L, int R) {
//		int count = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] >= L && nums[i] <= R) {
//				count++;
//				for (int j = i + 1; j < nums.length; j++) {
//					if (nums[j] <= R) {
//						count++;
//					} else {
//						break;
//					}
//				}
//			} else if (nums[i] < L) {
//				int temp = 0;
//				boolean flag = false;
//				for (int j = i + 1; j < nums.length; j++) {
//					if (nums[j] < L && flag) {
//						temp++;
//					} else if (nums[j] >= L && nums[j] <= R) {
//						flag = true;
//						temp++;
//					} else if (nums[j] > R) {
//						break;
//					}
//				}
//				if (flag) {
//					count += temp;
//				}
//			}
//		}
//
//		return count;
//	}
	
	
	public static int numSubarrayBoundedMax(int[] nums, int L, int R) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= L && nums[i] <= R) {
				count++;
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] <= R) {
						count++;
					} else {
						break;
					}
				}
			} else if (nums[i] < L) {
				int temp = 0;
				boolean flag = false;
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] < L && flag) {
						temp++;
					} else if (nums[j] >= L && nums[j] <= R) {
						flag = true;
						temp++;
					} else if (nums[j] > R) {
						break;
					}
				}
				if (flag) {
					count += temp;
				}
			}
		}

		return count;
	}
	
	public static int sumOfNSeqNum(int n) {
		return (n*(n+1))/2;
	}

//	public static void printArr(int[] arr, int from, int to) {
//		for (int i = from; i <= to; i++) {
//			System.out.print(arr[i] + ", ");
//		}
//		System.out.println(" ");
//	}

}
