package recursion;

import java.util.TreeSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
	}

	public static int removeDuplicates(int[] nums) {
		int cursor=0;
		
		for(int i:nums) {
			if(nums[cursor]==i) 
				continue;
			cursor++;
			nums[cursor]=i;
		}
		
		return cursor+1;
	}
}
