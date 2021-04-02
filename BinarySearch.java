package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};	
		System.out.println(bs(arr, 2));
	}
	
	public static int bs(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		int mid = (low+high)/2;
		
		while(true) {
			System.out.println(mid);
			if(low>high || high>arr.length-1){
				return -1;
			}else if(arr[mid]==target){
				return mid;
			}
			
			if(arr[mid]<target) {
				low=mid+1;
			}else if(arr[mid]>target) {
				high=mid-1;
			}
			
			mid = (low+high)/2;

		}
		
	}

}
  