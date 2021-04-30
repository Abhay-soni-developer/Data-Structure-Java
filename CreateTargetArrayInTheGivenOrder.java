package recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CreateTargetArrayInTheGivenOrder {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	
	}
	
	
//	 public static int[] createTargetArray(int[] nums, int[] index) {
//		int[] target = new int[nums.length];
//		LinkedList<Integer> list = new LinkedList<>();
//
//		for (int i = 0; i < nums.length; i++) {
//			list.add(index[i], nums[i]);
//		}
//
//		Iterator itr = list.iterator();
//		int idx = 0;
//		while (itr.hasNext()) {
//			int a = (int) itr.next();
//			target[idx] = a;
//			idx++;
//		}
//
//		return target;
//	}
	 
	 
	 public static int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];
		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < nums.length; i++) {
			for(int j=0; j<i; j++) {
				if(index[j]>=index[i]) {
					index[j]+=1;
				}
			}
		}
		
		
		for (int i = 0; i < nums.length; i++) {
			target[index[i]]=nums[i];
		}
		

		return target;
	}

}
