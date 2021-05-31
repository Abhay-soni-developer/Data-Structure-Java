package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement2 {

	public static void main(String[] args) {
		int[] a = { 1 };
		int[] result = nextGreaterElements(a);

		for (int i : result) {
			System.out.println(i);
		}
	}

//	public static int[] nextGreaterElements(int[] nums) {
//	int[] result = new int[nums.length];
//	Arrays.fill(result, -1);
//
//	for (int i=0; i<nums.length; i++) {
//		boolean flag=false;
//		
//			for(int j=i+1; j<nums.length; j++) {
//				if(nums[j]>nums[i]) {
//					result[i]=nums[j];
//					flag=true;
//					break;
//				}
//			}
//			
//			for(int k=0; flag==false && k<=i-1; k++) {
//				if(nums[k]>nums[i]) {
//					result[i]=nums[k];
//					flag=true;
//					break;
//				}
//			}
//	}
//
//	return result;
//}

	public static int[] nextGreaterElements(int[] nums) {
		int[] temp = new int[nums.length * 2];
		int size = nums.length;

		for (int i = 0; i < temp.length; i++) {
			temp[i] = nums[i % size];
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1, s = size; s > 0; s--, j++) {
				if (temp[j] > nums[i]) {
					temp[i] = nums[j % size];
					break;
				}else {
					temp[i] = -1;
				}
			}
		}

		return Arrays.copyOfRange(temp, 0, size);
	}

}
