package recursion;

public class MergeKLists {

	public static void main(String[] args) {
		int[] arr = {1,2,4};
		int[] arr1 = {8};
		int[] arr2 = {1,2,4};
		
		ListNode h1 = new ListNode(arr);
		ListNode h2 = new ListNode(arr1);
		ListNode h3 = new ListNode(arr2);
		
		ListNode[] lists = {h1,h2,h3};
		
		
		h1=mergeKLists(lists);
		
		while(h1!=null) {
			System.out.println(h1.val);
			h1=h1.next;
		}
	
	}
	
public static ListNode mergeKLists(ListNode[] lists) {
        
        int i=0;
        
        ListNode dummy = null;
        ListNode res = null;
        
        while(i<lists.length) {
            if(lists[i]==null) {
                i++;
                continue;
            }
            
            if(dummy==null) {
            	res=lists[i];
            	dummy=lists[i];
            }else {
            	dummy.next = lists[i];
            }
            
            while(dummy.next!=null){
            	dummy=dummy.next;
            }
            i++;   
        }
        
        return res;
    }

}
