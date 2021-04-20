package recursion;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {

	public static void main(String[] args) {
		int[] arr = {0,0,3,2};
		System.out.println(dominantIndex(arr));
	}
	
    public static int dominantIndex(int[] nums) {
    	int largest=Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
        int index=0;
        
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i]>largest) {
    			secondLargest=largest;
    			largest=nums[i];
    			index=i;
    			continue;
    		}
    		
    		if(nums[i]>secondLargest) {
    			secondLargest=nums[i];
    		}
    	}
    	
    	if(largest>=2*secondLargest) {
    		return index;
    	}else {
    		return -1;
    	}
    }

}
