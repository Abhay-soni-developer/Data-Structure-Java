package recursion;

import java.util.Arrays;

public class JumpGame3 {

	public static void main(String[] args) {
		int[] arr = { 4,2,3,0,3,1,2 };
		System.out.println(canReach(arr, 5));
	}

//	public static boolean canReach(int[] arr, int start) {
//		for(int n=0; n<arr.length; n++) {
//			if(arr[n]==0) {
//				boolean flag = canReach(arr, start, n, 1);
//				if(flag) {
//					return true;
//				};
//			}
//		}
//		return false;
//	}
//
//	public static boolean canReach(int[] arr, int start, int target, int count) {
//		if(count==arr.length+1) {
//			return false;
//		}
//		
//		if (start == target) {
//			return true;
//		}
//
//		int i = 0;
//		boolean flag = false;
//		int temp=0;
//		while (i < arr.length) {
//			
//			if(i==target) {
//				i++;
//				continue;
//			}
//			
//			temp = i + arr[i];
//			if (temp < arr.length && temp == target) {
//				flag =  canReach(arr, start, i, count+1);
//			}
//			
//			if(flag==true) {
//				break;
//			}
//			
//			temp = i - arr[i];
//			if (temp >= 0 && temp == target) {
//				flag = canReach(arr, start, i, count+1);
//			}
//			
//			if(flag==true) {
//				break;
//			}
//
//			i++;
//		}
//
//		return flag;
//	}

	public static boolean canReach(int[] arr, int start) {
		boolean[] hasVisited = new boolean[arr.length];
		return canReach(arr, start, 1, hasVisited);
	}

	public static boolean canReach(int[] arr, int current, int count, boolean[] hasVisited) {
		if (arr[current]==0) {
			return true;
		}
		
		if (count == arr.length + 1) {
			return false;
		}

		int temp = current + arr[current];
		if (temp < arr.length && hasVisited[temp]==false) {
			hasVisited[temp]=true;
			if(canReach(arr, temp, count+1, hasVisited)) {
				return true;
			}
		}
		
		
		
		temp = current - arr[current];
		if (temp >= 0 && hasVisited[temp]==false) {
			hasVisited[temp]=true;
			if(canReach(arr, temp, count+1, hasVisited)) {
				return true;
			}
		}

		return false;
	}

}
