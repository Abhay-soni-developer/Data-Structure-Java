package recursion;

public class MaximumSumLinkedList {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 30, 90, 120, 240, 511 };
		int[] arr2 = { 0, 3, 12, 32, 90, 125, 240, 249 };
		System.out.println(noMaxSumLinkedList(new ListNode(arr1), new ListNode(arr2)));
	}

	public static ListNode noMaxSumLinkedList(ListNode l1, ListNode l2) {
		ListNode res = null;
		ListNode p1 = l1, p2 = l2;

		int s1 = l1.val, s2 = l2.val;

		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				l2 = l2.next;
				if (l2 != null)
					s2 += l2.val;
			} else if (l1.val < l2.val) {
				l1 = l1.next;
				if (l1 != null)
					s1 += l1.val;
			} else if (l1.val == l2.val) {

				if (res == null) {
					if (s1 >= s2) {
						res = p1;
					} else if (s1 < s2) {
						res = p2;
					}
				} else {
					if (s1 >= s2) {
						p2.next = p1.next;
					} else if (s2 > s1) {
						p1.next = p2.next;
					}
				}
				p1 = l1;
				p2 = l2;
				s1 = 0;
				s2 = 0;
				l1 = l1.next;
				s1=l1.val;
			}
		}
		
		if (s1 >= s2) {
			p2.next = p1.next;
		} else if (s2 > s1) {
			p1.next = p2.next;
		}

		return res;
	}

}
