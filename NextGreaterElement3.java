package recursion;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement3 {

	public static void main(String[] args) {
		int[] arr = {3,3};
		ListNode head = new ListNode(arr);
		head = LinkedListPractice.reverseList(head);
		
		System.out.println(Arrays.toString(nge(head, arr.length)));
	}
	
	// for array
	public static int[] nge(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int i=arr.length-1;
		
		while(i>=0) {
			if(stack.isEmpty()) {
				stack.push(arr[i]);
				arr[i]=0;
				i--;
				continue;
			}
			
			if(stack.peek()>arr[i]) {
				int temp=stack.peek();
				stack.push(arr[i]);
				arr[i]=temp;
				i--;
				continue;
			}
			
			while(!stack.isEmpty() && stack.peek()<arr[i]) {
				stack.pop();
			}
			
		}
		
		return arr;
	}
	
	// for ListNode
	public static int[] nge(ListNode head, int size) {
		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[size];
		int i=size-1;
		
		while(head!=null) {
			if(stack.isEmpty()) {
				stack.push(head.val);
				arr[i]=0;
				head=head.next;
				i--;
				continue;
			}
			
			if(stack.peek()>head.val) {
				int temp=stack.peek();
				stack.push(head.val);
				arr[i]=temp;
				head=head.next;
				i--;
				continue;
			}
			
			while(!stack.isEmpty() && stack.peek()<=head.val) {
				stack.pop();
			}
			
		}
		
		return arr;
	}

}
