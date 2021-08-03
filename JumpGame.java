package recursion;

import java.util.Arrays;

public class JumpGame {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 0, 4 };
		System.out.println(canJump(arr));
	}

	public static boolean canJump(int[] nums) {
		int getTillIndex = nums.length - 1;

		if (nums.length == 1) {
			return true;
		}

		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] + i >= getTillIndex) {
				getTillIndex = i;
			}
		}

		return getTillIndex==0;
	}
	
	
//	public static boolean canJump(int[] nums) {
//		int getTillIndex = nums.length - 1;
//
//		if (nums.length == 1) {
//			return true;
//		}
//
//		for (int i = nums.length - 2; i >= 0; i--) {
//			if (nums[i] + i >= getTillIndex) {
//				getTillIndex = i;
//			}
//			else {
//				nums[i] = 0;
//			}
//		}
//		
//
//		return nums[0] != 0;
//	}

}
