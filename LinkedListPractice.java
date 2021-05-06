package recursion;


public class LinkedListPractice {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
		ListNode h1 = new ListNode(arr);
		
//		h1=swapEachPair(h1);
//		mulByN(h1);
//		h1=ListNode.insertBefore(h1, -10);
//		ListNode h2 = ListNode.cloneList(h1);
//		h1.insertInMiddle(5);
		
		System.out.println(h1);
//		System.out.println(h2);
		
	}
	
	public static ListNode swapEachPair(ListNode h1) {
		ListNode swapFrom = h1;
		ListNode swapTo = null;
		int i=1;
		
		while(swapFrom!=null && swapFrom.next!=null) {
			i++;
			if(i%2==0) {
				swapTo=swapFrom.next;
				int temp = swapTo.val;
				swapTo.val = swapFrom.val;
				swapFrom.val=temp;
				continue;
			}
			swapFrom=swapTo.next;
		}
		
		return h1;
	}
	
	public static void mulByN(ListNode head) {
		head.val*=2;
		if(head.next!=null) {
			mulByN(head.next);
		}
	}
	
    public static ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) {
            return head;
        }
        
        ListNode p1=head, p2=head.next, p3=head.next.next;
        p1.next=null;
       
        while(p2!=null) {
            p2.next=p1;
            p1=p2;
            p2=p3;
            if(p3!=null) {
                p3=p3.next;
            }
        }
        
        return p1;
    }
    
    public void deleteNode(ListNode head) {
        
        while(head!=null && head.next!=null) {
            head.val=head.next.val;
            if(head.next.next==null) {
                head.next=null;
            }
            head=head.next;
        }
        
    }
	
}
