package recursion;

import java.util.HashMap;
import java.util.Iterator;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(arr));
	}
	
	

//	public static int majorityElement(int[] nums) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		int largest=0;
//		int majority=0;
//		for(int n:nums) {
//			if(map.get(n)==null) {
//				map.put(n, 1);
//			}else {
//				map.put(n, map.get(n)+1);
//			}
//			
//			if(map.get(n)>largest){
//				largest=map.get(n);
//				majority=n;
//			}
//		}
//		
//		return majority;
//	}

	
	public static int majorityElement(int[] nums) {
		int count = 1;
		int majority = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (majority == nums[i]) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				majority = nums[i];
				count = 1;
			}
		}

		return majority;
	}
	
}
