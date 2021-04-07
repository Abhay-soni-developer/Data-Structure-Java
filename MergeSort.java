package recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 2, 4, 6, 7, 8, 1 };
		System.out.println(Arrays.toString(mergeSort(arr)));
	}

	private static int[] mergeSort(int[] nums) {
		if (nums.length <= 1) {
			return nums;
		}
		int mid = nums.length / 2;
		nums = MergeSortedArray.merge(mergeSort(Arrays.copyOfRange(nums, 0, mid)),
				mergeSort(Arrays.copyOfRange(nums, mid, nums.length)));
		System.out.println(Arrays.toString(nums));
		return nums;
	}



}
