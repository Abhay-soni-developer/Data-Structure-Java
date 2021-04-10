package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class DutchNationalFlag {

	public static void main(String[] args) {
//		int[] arr = { 2, 0, 2, 1, 1, 0 };
//		sortColors(arr);
//
//		for (int i : arr) {
//			System.out.println(i);
//		}

	
	}

	public static void sortColors(int[] nums) {
		int[] count = new int[3];

		for (int i = 0; i < nums.length; i++) {
			count[nums[i]] += 1;
		}

		int startIndex = 0;
		int endIndex = 0;

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				endIndex = startIndex + count[i];
				Arrays.fill(nums, startIndex, endIndex, i);
				startIndex = endIndex;
			}
		}
	}

}
