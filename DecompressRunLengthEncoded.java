package recursion;

import java.util.Arrays;

public class DecompressRunLengthEncoded {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3 };
		DecompressRunLengthEncoded.decompressRLElist(arr);

	}

	public static int[] decompressRLElist(int[] nums) {
		int total=0;
		int[] prefixSumArr = new int[nums.length/2];
		
		for(int i=0; i<nums.length; i=i+2) {
			total+=nums[i];
			prefixSumArr[i/2]=total;
		}
		
		int[] res = new int[total];
		int startIndex=0;
		int endIndex=0;
		for(int i=0; i<prefixSumArr.length; i++) {
			endIndex=prefixSumArr[i];
			Arrays.fill(res, startIndex, endIndex, nums[(i*2)+1]);
			startIndex=endIndex;
		}
		
		return res;
	}

}
