package recursion;

public class SortColors {

	public static void main(String[] args) {
		int[] arr = { 1,2,1,0,1,2,0,1,0,1 };
		sortColors(arr);

		for (int n : arr) {
			System.out.print(n + ", ");
		}
	}

// 	public static void sortColors(int[] nums) {
//		int[] count = new int[3];

//		for(int i=0; i<nums.length; i++) {
//			count[nums[i]]+=1;
//		}

//		int startIndex=0;
//		int endIndex=0;

//		for(int i=0; i<count.length; i++) {
//			if(count[i]!=0) {
//				endIndex=startIndex+count[i];
//				Arrays.fill(nums, startIndex, endIndex, i);
//				startIndex=endIndex;
//			}
//		}
//	}

	public static void sortColors(int[] nums) {
		int low = 0, high = nums.length - 1;

		for (int i = low; i <= high; i++) {

			while (nums[low] == 0 && low<high) {
				low += 1;
			}

			while (nums[high] == 2 && high>low) {
				high -= 1;
			}
			
			if(low>=high) {
				break;
			}

			if (i < low) {
				i=low;
			}

			if (nums[i] == 0) {
				swap(nums, i, low);
				low++;
				i--;
			}

			if (nums[i] == 2) {
				swap(nums, i, high);
				high--;
				i--;
			}

		}

	}


//	public static void swap(int[] arr, int i, int j) {
//		int temp = arr[i];
//		arr[i] = arr[j];
//		arr[j] = temp;
//	}
	
	public static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
		arr[i] = arr[i]-arr[j];
	}
}
