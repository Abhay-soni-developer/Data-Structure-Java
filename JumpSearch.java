package recursion;

public class JumpSearch {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,7,8,9,11,11,11,12,13,15, 16, 17, 18, 19, 19, 19, 19, 19, 20};
		System.out.println(jumpSearch(arr, 10));
	}
	
	public static int jumpSearch(int arr[], int target) {
		int jump = (int)Math.sqrt(arr.length);
		int low=0;
		int high=0;
		boolean flag = true;
		int count=0;
		
		if(arr[arr.length-1]<target) {
			return -1;
		}
		
		while(flag) {			
			System.out.println(++count);
			if(arr[high]>=target) {
				return linearSearch(arr, low, high, target);
			}else if(high+jump<arr.length && arr[high]<target) {
				low=high;
				high+=jump;
				continue;
			}else if(high+jump>arr.length-1){
				low=high;
				high=arr.length-1;
				continue;
			}

		}
		
		return -1;
	}
	
	public static int linearSearch(int[] arr, int low, int high, int target) {
		
		for(int i=low; i<high; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}

}
