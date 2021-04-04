package recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4,3,7,1,5,9,4,3,6};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	
	public static int[] bubbleSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			boolean swapped=false;
			for(int j=0; j<arr.length-1-i; j++) {  //optimization 2
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
					swapped=true;
				}
			}
			
			if(!swapped) {
//				System.out.println("optimization 1"); 
				break;
			}
		}
		
		return arr;
	}
	
	public static void swap(int[] arr, int from, int to) {
		int temp=arr[from];
		arr[from]=arr[to];
		arr[to]=temp;
	}
}
