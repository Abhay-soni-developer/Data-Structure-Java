package recursion;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(arr));

	}

	public static int missingNumber(int[] nums) {
		int[] arr = new int[nums.length + 1];

		for (int n : nums) {
			arr[n] = -1;
		}

		for (int n = 0; n < arr.length; n++) {
			if (arr[n] != -1) {
				return n;
			}
		}

		return nums.length;
	}

//    public static int missingNumber(int[] nums) {
//    	
//    	Arrays.sort(nums);
//    	
//    	for(int n=0; n<nums.length; n++) {
//    		if(n!=nums[n]) {
//    			return n;
//    		}
//    	}
//    	
//    	return nums.length;
//    }

}
