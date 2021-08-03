package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JumpGame2 {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4,
				4, 2, 0, 3, 8, 5 };
		System.out.println(jump(arr));
	}

	public static int jump(int[] nums) {
		int getTillIndex=nums.length-1;
		int longestPossibleJumpFrom=0;
		int jumpCount = 0;
		for(int i=nums.length-2; i>=0;) {
			i=getTillIndex;
			for(int j=i; j>=0; j--) {
				if(nums[j]+j>=getTillIndex) {
					longestPossibleJumpFrom=j;
				}
			}
			getTillIndex=longestPossibleJumpFrom;
			jumpCount++;
			if(getTillIndex==0 ) {
				break;
			}
		}
		return jumpCount;
	}

}
