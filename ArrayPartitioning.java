package recursion;

import java.util.Arrays;

public class ArrayPartitioning {

	public static void main(String[] args) {
		int[] arr = {7,9,4,8,3,6,2,1};
//		partition(arr, 5);
		
//		quickSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void partition(int[] arr, int pivot) {
		for(int i=1, j=0; i<arr.length; i++) {
			if(arr[i]<pivot) {
				swap(arr, i, j);
				j++;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	

}
