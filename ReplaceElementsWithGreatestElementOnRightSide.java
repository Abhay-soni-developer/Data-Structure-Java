package recursion;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(replaceElements(arr)));
	}

	public static int[] replaceElements(int[] arr) {
		int greatestYet=arr[arr.length-1];
		arr[arr.length-1]=-1;
		int temp;
		for(int i=arr.length-2; i>=0; i--) {
			temp=arr[i];
			arr[i]=greatestYet;
			if(temp>greatestYet) {
				greatestYet=temp;
			}
		}
		
		return arr;
	}

}
