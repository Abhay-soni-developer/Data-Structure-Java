package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SumTriplet {

	public static void main(String[] args) {
		int[] arr = { -2, 0, 0, 2, 2 };
		List<List<Integer>> res = threeSum(arr);

		Iterator itr = res.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		int i = 0;
		int j = nums.length - 1;
		Arrays.sort(nums);

		for (int k = 0; k < nums.length - 2;) {
			int target = 0 - nums[k];
			i = k + 1;
			j = nums.length - 1;
			
			while (i < j) {
				if (nums[i] > target) {
					break;
				}

				if (nums[i] + nums[j] == target) {
					List<Integer> list = new ArrayList<>(3);
					list.add(nums[k]);
					list.add(nums[i]);
					list.add(nums[j]);
					res.add(list);
					i++;
					j--;
					while (j>=0 && nums[j] == nums[j + 1]) {
						j--;
					}
					while (i<nums.length-1 && nums[i] == nums[i - 1]) {
						i++;
					}
				} else if (nums[i] + nums[j] > target) {
					j--;
					while (j>=0 && nums[j] == nums[j + 1]) {
						j--;
					}
				} else if (nums[i] + nums[j] < target) {
					i++;
					while (i<nums.length-1 && nums[i] == nums[i - 1]) {
						i++;
					}
				}
			}
			k++;

			while (k < nums.length && nums[k] == nums[k - 1]) {
				k++;
			}

		}

		return res;
	}

}
