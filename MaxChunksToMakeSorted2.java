package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class MaxChunksToMakeSorted2 {

	public static void main(String[] args) {
		int[] arr = { 0, 3, 0, 3, 2 };
		System.out.println(maxChunksToSorted(arr));
	}

	public static int maxChunksToSorted(int[] nums) {
		int[] sorted = nums.clone();
		Arrays.sort(sorted);
		int count = 0;
		int i = 0;

		HashMap<Integer, Integer> frequencyList = new HashMap<>();

		while (i < nums.length) {

			frequencyList.put(nums[i], frequencyList.getOrDefault(nums[i], 0) + 1);
			frequencyList.put(sorted[i], frequencyList.getOrDefault(sorted[i], 0) - 1);

			Iterator itr = frequencyList.keySet().iterator();
			boolean flag = true;

			while (itr.hasNext()) {
				int key = (int) itr.next();
				if (frequencyList.get(key) != 0) {
					flag = false;
				}
			}

			if (flag) {
				count++;
			}

			i++;
		}

		return count;
	}

//	public static int getTillIndex(HashMap<Integer, Integer> list, int n) {
//		int tillIndex = 0;
//
//		for (int i = 0; i <= n; i++) {
//			if (list.get(i) != null) {
//				tillIndex += list.get(i);
//			}
//		}
//
//		return tillIndex - 1;
//	}
//
//	public static HashMap<Integer, Integer> getFrequencyList(int[] nums) {
//		HashMap<Integer, Integer> list = new HashMap<>();
//
//		for (int i = 0; i < nums.length; i++) {
//			if (list.get(nums[i]) == null) {
//				list.put(nums[i], 1);
//			} else {
//				list.put(nums[i], list.get(nums[i]) + 1);
//			}
//		}
//
//		return list;
//	}

}
