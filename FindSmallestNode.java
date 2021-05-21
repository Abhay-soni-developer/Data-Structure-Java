package recursion;

public class FindSmallestNode {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,4,5};

	}
	
	
    public static ListNode getAndRemoveSmallestNode(ListNode head) {
        ListNode smallest=head;
        head=head.next;
        while(head.next!=null) {
            if(head.next.val<smallest.val) {
                smallest=head.next;
            }
        }
        
        
        
        return smallest;
    }

}
