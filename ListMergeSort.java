package recursion;

public class ListMergeSort {

	public static void main(String[] args) {
		int[] arr = { 5,4,3,2,1 };
//		int[] arr = { 4,2,1,3 };
		ListNode h1 = new ListNode(arr);
		h1 = sortList(h1);
		while (h1 != null) {
			System.out.println(h1.val);
			h1 = h1.next;
		}
	}

	public static ListNode sortList(ListNode head) {
		int listLen = getListLength(head);		
		head = sortList(head, listLen);
		return head;
	}
	
	public static ListNode sortList(ListNode head, int listLength) {
		if(listLength<=1) {
			return head;
		}
		
		int len1 = listLength/2, len2 = listLength-len1;
		
		ListNode head2 = divListAtPos(head, len1);
		
		head = sortList(head, len1);
		head2 = sortList(head2, len2);
		
		return mergeTwoSortedLists(head, head2);
	}
	
	public static ListNode divListAtPos(ListNode l1, int len) {
		
		while(len!=1) {
			len--;
			l1=l1.next;
		}
	
		ListNode res = l1.next;
		l1.next=null;
		return res;
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
	
    public static int getListLength(ListNode head) {
        int len=0;
        
        while(head!=null) {
            head=head.next;
            len++;
        }
        
        return len;
    }

}
