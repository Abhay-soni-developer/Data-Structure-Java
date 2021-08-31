package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] arr = {5,4,-1,7,8};
		System.out.println(maxSubArray(arr));
	}

	// implementation of kadane's algo
	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int greatest = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < nums.length; i++) {
			
			sum = Math.max(nums[i], sum+nums[i]);
			greatest = Math.max(greatest, sum);
			
			
		}
		return greatest;
	}

}
