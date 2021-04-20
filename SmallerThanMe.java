package recursion;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class SmallerThanMe {

	public static void main(String[] args) {
		int[] arr = {1,2,6,7,0,0,9};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] sorted = nums.clone();
		Arrays.sort(sorted);
		int[] result = new int[nums.length];
		
		for(int k=0; k<sorted.length; k++) {
			if(k>0 && sorted[k]==sorted[k-1]) {
				continue;
			}
			for(int j=0; j<nums.length; j++) {
				if(nums[j]==sorted[k]) {
					result[j]=k;
				}
			}
		}
		
		return result;
	}

}
