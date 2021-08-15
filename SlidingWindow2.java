package recursion;

public class SlidingWindow2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,2,1,8,7,6,3,2,1};
		System.out.println(findTotalCount(arr, 3));
		
	}
	
	public static int findTotalCount(int[] nums, int k) {
		int count=0;
		int i=0;
		
		while(i<nums.length) {
			if(nums[i]==k) {
				while(nums[i]-1==(nums[i+1])) { 
					if(nums[i+1]==1) {
						count++;
						break;
					}
					i++;
				}
				i++;
			}else {
				i++;
			}
		}
		
		return count;
	}

}
