package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSubsets {

	public static void main(String[] args) {
		int[] set = { 1, 2, 3 };
		FindSubsets fs = new FindSubsets();
		System.out.println(fs.subsets(set));
	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		getSuperSet(nums, 0, result, new ArrayList<>());
		return result;
	}

	public void getSuperSet(int[] nums, int counter, List<List<Integer>> result, List<Integer> lastComputedList) {
		result.add(lastComputedList);
		for(int i=counter; i<nums.length; i++) {
			List<Integer> newList = new ArrayList<>(lastComputedList);
			newList.add(nums[i]);
			getSuperSet(nums, i+1, result, newList);
		}
	}

}
