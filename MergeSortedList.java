package recursion;

public class MergeSortedList {

	public static void main(String[] args) {
		int[] arr = {1,3,5,6,8};
		int[] arr1 = {2,4,7,9};
	
		
		ListNode ls1 = mergeTwoSortedLists(new ListNode(arr), new ListNode(arr1));
		
		while(ls1!=null) {
			System.out.println(ls1.val);
			ls1=ls1.next;
		}
	}

	public static ListNode mergeTwoSortedLists(ListNode h1, ListNode h2) {
		if (h1 == null) {
			return h2;
		} else if (h2 == null) {
			return h1;
		}

		ListNode res = null;
		ListNode temp = null;

		if (h1.val > h2.val) {
			res = h2;
			temp = h2;
			h2 = h2.next;
		} else {
			res = h1;
			temp = h1;
			h1 = h1.next;
		}

		while (h1 != null || h2 != null) {
			if (h1 == null) {
				temp.next = h2;
				break;
			} else if (h2 == null) {
				temp.next = h1;
				break;
			} else {

				if (h1.val > h2.val) {
					temp.next = h2;
					temp = temp.next;
					h2 = h2.next;
				} else {
					temp.next = h1;
					temp = temp.next;
					h1 = h1.next;
				}
			}
		}

		return res;
	}

}
