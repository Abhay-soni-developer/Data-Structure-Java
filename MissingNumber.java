package recursion;

public class MissingNumber {

	public static void main(String[] args) {
		int[] list = {1,2,4,5,6,7};
//		System.out.println(findMissingNumber(list, 0));
		int[] unorderedList = {2,1,4,3,7,6,5,9};
		System.out.println(findMissingNumberInUnorderedList(unorderedList));
	} 
	
	public static int findMissingNumber(int[] arr, int count) {
		if(count<arr.length-1) {
			if(arr[count]+1==arr[count+1]) {
				return findMissingNumber(arr, count+1);
			}else {
				return arr[count]+1;
			}
		}else if(count==arr.length-1) {
			return arr[count]+1;
		}
		
		return -1;
	}
	
	
//	public static int findMissingNumberUsingBst(int[] arr, int count) {
//	
//		if(count==arr.length-1 && arr[count]==arr.length) {
//			return arr.length;
//		}else if(arr[count]==count){
//			
//		}
	
	
	public static int findMissingNumberInUnorderedList(int[] arr) {
		int sum = 0;
		for(int el:arr) {
			sum = sum+el;
		}
		
		int sumOfN = ((arr.length+1)*(arr.length+2))/2;
		return sumOfN-sum;
	}
}