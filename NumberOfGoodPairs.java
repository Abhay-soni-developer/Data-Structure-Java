package recursion;

import java.util.HashMap;
import java.util.Iterator;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 1, 3 };
		System.out.println(numIdenticalPairs(arr));
	}

	public static int numIdenticalPairs(int[] nums) {
		HashMap<Integer, Integer> frequencyList = getFrequencyList(nums);
		int totalPairs = 0;
		int i = 0;
		Iterator itr = frequencyList.keySet().iterator();

		while (itr.hasNext()) {
			int temp = frequencyList.get((int) itr.next());
			if (temp > 1) {
				totalPairs += getTotalNumOfPossibleCombinations(temp);
			}
		}

		return totalPairs;
	}

	public static int getTotalNumOfPossibleCombinations(int n) {
		return (n * (n - 1)) / 2;
	}

	public static HashMap<Integer, Integer> getFrequencyList(int[] nums) {
		HashMap<Integer, Integer> list = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (list.get(nums[i]) == null) {
				list.put(nums[i], 1);
			} else {
				list.put(nums[i], list.get(nums[i]) + 1);
			}
		}

		return list;
	}

}
