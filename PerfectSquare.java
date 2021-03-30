package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(256));
	}

//	public static boolean isPerfectSquare(int num) {
//		if(num==1) {
//			return true;
//		}
//
//		int i = 2;
//		ArrayList<Integer> list = new ArrayList<>();
//
//		while (num != 1) {
//			while (num % i != 0) {
//				i++;
//			}
//			list.add(i);
//			num = num / i;
//			i = 2;
//		}
//
//		System.out.println(list);
//		Collections.sort(list);
//		int count = 1;
//
//		if (list.size() == 0 || list.size() == 1) {
//			return false;
//		}
//
//		for (i = 1; i < list.size(); i++) {
//			if (list.get(i) == list.get(i - 1)) {
//				count++;
//			} else {
//				if (count % 2 == 0) {
//					count = 1;
//					continue;
//				} else {
//					return false;
//				}
//			}
//		}
//
//		if (count != 0) {
//			if (count % 2 == 0) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//		
//		return true;
//
//	}

//	public static boolean isPerfectSquare(int num) {
//		if(num==1) {
//			return true;
//		}
//
//		double root = Math.sqrt(num);
//		
//		root = root - (int)root;
//		
//		if(root==0) {
//			return true;
//		}
//		
//		return false;
//	}

	public static boolean isPerfectSquare(int num) {
		if (num == 1 || num == 0) {
			return true;
		}

		int temp = 1;

		while (num - (temp * temp) > 0) {
			temp++;
		}

		if (num - (temp * temp) == 0) {
			return true;
		}

		return false;

	}

}
