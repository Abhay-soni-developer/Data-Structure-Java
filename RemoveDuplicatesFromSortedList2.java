package recursion;

public class RemoveDuplicatesFromSortedList2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,4,5};
		System.out.println(deleteDuplicates(new ListNode(arr)));
	}
	
	
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode ptr=head, cpt=null;
        
        while(ptr!=null) {
            if(ptr.next!=null && ptr.val==ptr.next.val){
                while(ptr.next!=null && ptr.val==ptr.next.val) {
                    ptr=ptr.next;
                }
            }else{
                if(cpt==null) {
                    cpt=ptr;
                    head=cpt;
                    ptr=ptr.next;
                    continue;
                }
                cpt.next=ptr;
                cpt=cpt.next;
            }
            ptr=ptr.next;
        }
        
        cpt.next=null;
        
        return head;
    }

}
