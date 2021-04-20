package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		int[] nums1 = { 4, 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4, 10 };
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}

//	public static int[] intersection(int[] nums1, int[] nums2) {
//
//		if (nums1.length == 0 || nums2.length == 0) {
//			return new int[0];
//		}
//
//		if (nums1.length < nums2.length) {
//			return intersection(nums2, nums1);
//		}
//		
//		HashSet<Integer> set = new HashSet<>();
//		HashSet<Integer> set1 = new HashSet<>();
//
//		for (int i = 0; i < nums2.length; i++) {
//			set.add(nums2[i]);
//		}
//
//		for (int i = 0; i < nums1.length; i++) {
//			set1.add(nums1[i]);
//		}
//		
//		set1.retainAll(set);
//
//		return set1.stream().mapToInt(i -> i).toArray();
//	}
	
	
	public static int[] intersection(int[] nums1, int[] nums2) {

		if (nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		}
		
		int temp=nums1.length>=nums2.length?nums1.length:nums2.length;
		int[] arr = new int[temp];
		temp=0;
		boolean[] map = new boolean[1001];
		
		for (int i = 0; i < nums1.length; i++) {
			map[nums1[i]]=true;
		}
		
		for (int i = 0; i < nums2.length; i++) {
			if(map[nums2[i]]) {
				map[nums2[i]]=false;
				arr[temp++]=nums2[i];
			}
		}
		
		return Arrays.copyOfRange(arr, 0, temp);
	}

}
