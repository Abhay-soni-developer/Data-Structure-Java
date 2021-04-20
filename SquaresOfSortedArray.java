package recursion;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] arr = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(arr)));
	}
	
    public static int[] sortedSquares(int[] nums) {
        int front = 0;
        int tail = nums.length-1;
        int idx = nums.length-1;
        int[] res = new int[nums.length];
        
        while(front<=tail) {
        	if(Math.abs(nums[front])>Math.abs(nums[tail])) {
        		res[idx]=nums[front]*nums[front];
        		front++;
        		idx--;
        	}else if(Math.abs(nums[front])<=Math.abs(nums[tail])) {
        		res[idx]=nums[tail]*nums[tail];
        		tail--;
        		idx--;
        	}
        }
        
        return res;
    }

}
