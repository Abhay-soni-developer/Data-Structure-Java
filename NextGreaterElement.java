package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] a = { 4,1,2 };
		int[] b = { 1,3,4,2 };

		int[] result = nextGreaterElement(a, b);

		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> result = new HashMap<>();
		int[] actualResult = new int[nums1.length];

		Stack<Integer> stack = new Stack<>();

		for (int i = nums2.length - 1; i >= 0; i--) {
			if (stack.isEmpty()) {
				stack.push(nums2[i]);
				result.put(nums2[i], -1);
			} else {
				while (!stack.isEmpty() && nums2[i] > (int) stack.peek()) {
					stack.pop();
				}
				int temp = stack.isEmpty() ? -1 : (int) stack.peek();
				result.put(nums2[i], temp);
				stack.push(nums2[i]);
			}

		}

		for (int i = 0; i < nums1.length; i++) {
			actualResult[i] = (int) result.get(nums1[i]);
		}

		return actualResult;
	}

}
