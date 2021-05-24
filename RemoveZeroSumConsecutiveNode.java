package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RemoveZeroSumConsecutiveNode {

	public static void main(String[] args) {
		int[] arr = {1,2,3,-3,4};
		System.out.println(removeZeroSumSublists(new ListNode(arr)));
		
	}
	
	
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode res = head;
        HashMap<Integer, ListNode>  prefixSum = new HashMap<>();
        int sumTillNow=0;
        
        while(head!=null){ 
        	sumTillNow+=head.val;
        	
        	if(sumTillNow==0) {
        		res=head.next;
        		prefixSum=new HashMap<>();
        	}
        	
        	if(prefixSum.containsKey(sumTillNow)) {
        		ListNode node = prefixSum.get(sumTillNow);
        		ListNode dummy=node.next;
        		int temp=sumTillNow;
        		while(dummy!=null && dummy!=head.next) {
        			temp+=dummy.val;
        			prefixSum.remove(temp);
        			dummy=dummy.next;
        		}
            	prefixSum.put(sumTillNow, node);
        		node.next=dummy;
        		head=dummy;
        		continue;
        	}
        	
        	prefixSum.put(sumTillNow, head);
    		head=head.next;
    	}
        
        
        return res;
    }
	
	

}
