package recursion;

public class SeprateEvenAndOddLL {

	public static void main(String[] args) {
		int[] arr = {5,7,8,23,4,5,7,9,3,2,4 };
		ListNode ls = new ListNode(arr);

		System.out.println(sepEvenAndOddPlaces(ls));
	}

	public static ListNode sepEvenAndOddPlaces(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode ptr = head, cpt = head.next, dummy = cpt;

		while (ptr != null && cpt != null) {
			ptr.next = cpt.next;
			if(ptr.next!=null) {
				ptr = ptr.next;
			}
			
			if (ptr == null) {
				break;
			}
			cpt.next = ptr.next;
			cpt = cpt.next;
		}

		ptr.next=dummy;

		return head;
	}

//	public static ListNode sepEvenAndOddPlaces(ListNode head) {
//		if (head == null || head.next == null) {
//			return head;
//		}
//
//		ListNode ptr = null, cpt = null, p1 = null, p2 = null;
//
//		while (head != null) {
//			if (head.val % 2 == 0 && ptr == null) {
//				ptr = head;
//				p1 = ptr;
//			} else if (head.val % 2 == 0) {
//				ptr.next = head;
//				ptr=ptr.next;
//			}
//
//			if (head.val % 2 == 1 && cpt == null) {
//				cpt = head;
//				p2 = cpt;
//			} else if (head.val % 2 == 1) {
//				cpt.next = head;
//				cpt=cpt.next;
//			}
//
//			head = head.next;
//		}
//		
//
//		cpt.next=null;
//		ptr.next = p2;
//
//		return p1;
//	}

}
