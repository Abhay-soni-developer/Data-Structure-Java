package recursion;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] sorted1 = { 1,3,5 };
		int m = 1;
		int[] sorted2 = {2,4,6};
		int n = 0;
		System.out.println(Arrays.toString(merge(sorted1, sorted2)));
	}

	public static int[] merge(int[] nums1, int[] nums2) {
		
		int[] res = new int[nums1.length+nums2.length];
		
		int i = 0, j = 0, k = 0;

		while (i < res.length) {
			if (j < nums1.length && k < nums2.length) {
				if (nums1[j] >= nums2[k]) {
					res[i] = nums2[k];
					k++;
				} else if (nums1[j] < nums2[k]) {
					res[i] = nums1[j];
					j++;
				}
				i++;
				continue;
			} else if (j < nums1.length) {
				Arrays.copyOfRange(nums1, j, nums1.length);
				while(j<nums1.length) {
					res[i]=nums1[j];
					i++;
					j++;
				}
				break;
			} else if (k < nums2.length) {
				while(k<nums2.length) {
					res[i]=nums2[k];
					i++;
					k++;
				}
				break;
			}
		}
		
		return res;
	}

}
