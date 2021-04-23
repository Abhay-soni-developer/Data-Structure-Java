package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MajorityElement2 {

	public static void main(String[] args) {
		int arr[] = { 4 };
//		System.out.println(Arrays.toString(arr));
		System.out.println(majorityElement(arr));
	}

//	public static List<Integer> majorityElement(int[] nums) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		List<Integer> list = new ArrayList<>();
//		int largest = 0;
//		int majority = 0;
//		for (int n : nums) {
//			if (map.get(n) == null) {
//				map.put(n, 1);
//			} else {
//				map.put(n, map.get(n) + 1);
//			}
//		}
//
//		Iterator itr = map.keySet().iterator();
//
//		while (itr.hasNext()) {
//			int key = (int) itr.next();
//			if (map.get(key) > nums.length / 3) {
//				list.add(key);
//			}
//		}
//
//		return list;
//	}

	public static List<Integer> majorityElement(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<>();

		int count = 1;
		int i = 1;

		while (i < nums.length) {
			if (nums[i] == nums[i - 1]) {
				count++;
			} else if (count > nums.length / 3) {
				list.add(nums[i-1]);
				count=1;
			}else if(count<=nums.length/3){
				count=1;
			}
			i++;
		}
		
		if(count>nums.length/3) {
			i--;
			list.add(nums[i]);
		}
		
		return list;
	}

}
