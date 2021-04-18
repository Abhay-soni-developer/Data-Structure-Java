package recursion;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
		int arr[] = {5,1,3,9,2};
		System.out.println(Arrays.toString(twoSum(arr, 8)));
	}
	
//
//	public static int[] twoSum(int[] nums, int target) {
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					int[] a = { i, j };
//					return a;
//				}
//			}
//
//		}
//		int[] result= {0,0};
//		return result;
//	}

	// optimized way after sorting
//	public static int[] twoSum(int[] nums, int target) {
//		Arrays.sort(nums); 
//        int i=0,j=nums.length-1;
//		int sum=nums[i]+nums[j];
//
//        while(sum!=target && i<j) {
//			if(sum>target) {
//				j--;
//			}else  if(sum<target){
//				i++;
//			}
//		}
//        
//            
//		int[] result= {nums[i], nums[j]};
//		return result;
//	}

	// using hashMap
//	public static int[] twoSum(int[] nums, int target) {
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		
//		for(int i=0; i<nums.length; i++) {
//			hm.put(nums[i], 1);
//		}
//		int[] result = new int[nums.length*2];
//		int start=0, end=start+1;
//		
//		for(int i=0; i<nums.length; i++) {
//			int key = nums[i];
//			int key1 = target-key;
//			if(hm.get(key1)!=null && hm.get(key1)==1) {
//				result[start]=key;
//				result[end]=key1;
//				hm.put(key, 0);
//				start+=2;
//				end=start+1;
//			}
//		}
//		
//		return result;
//		
//	}
	
	// using two pointer technique
	public static int[] twoSum(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;
        int[] result = {0,0};
        
        Arrays.toString(nums);
        
        while(i<j) {
            if(nums[i]+nums[j]>target) {
                j--;
            }else if(nums[i]+nums[j]<target) {
                i++;
            }else if(nums[i]+nums[j]==target) {
                result[0]=i;
                result[1]=j;
                return result;
            }
        }
        
        //indexes position wont be correct bcoz of sorting
        return result;
		
	}

}
