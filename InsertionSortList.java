package recursion;

public class InsertionSortList {

	public static void main(String[] args) {
		int[] arr1 = {-1,5,3,4,0};
		ListNode list = new ListNode(arr1);
		System.out.println(insertionSortList(list));
	}
	
	
    public static ListNode insertionSortList(ListNode head) {
        ListNode ptr=head.next, cpt=head, current=null, tail=head;
        tail.next=null;
        
        while(ptr!=null) {
            current=ptr;
            ptr=ptr.next;
            current.next=null;
            
            if(current.val<cpt.val) {
                current.next=head;
                head=current;
                cpt=head;
                continue;
            }
            
            while(cpt.next!=null) {
                if(cpt.next.val>current.val) {
                    current.next=cpt.next;
                    cpt.next=current;
                    break;
                }
                cpt=cpt.next;
            }
            
            if(cpt.next==null) {
                cpt.next=current;
                tail=current;
            }
            
            cpt=head;
        }
        
        return head;
        
    }
    

}
