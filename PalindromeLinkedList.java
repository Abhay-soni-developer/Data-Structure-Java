package recursion;

import java.util.Stack;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,2,1};
		ListNode head = new ListNode(arr);
		System.out.println(isPalindrome(head));
	}
	
	// USING STACK
//	 public static boolean isPalindrome(ListNode head) {
//	        Stack<Integer> stk = new Stack<>();
//	        boolean isOddLen = false;
//	        ListNode ptr=head, cpt=head;
//	        
//	        while(cpt!=null) {
//	        	stk.push(ptr.val);
//	        	if(cpt!=null) {
//	        		cpt=cpt.next;
//	        		isOddLen=true;
//	        		if(cpt!=null) {
//	        			isOddLen=false;
//	        			cpt=cpt.next;
//	        			ptr=ptr.next;
//	        		}
//	        	}
//	        }
//	        
//	        if(isOddLen) {
//	        	stk.pop();
//	        	ptr=ptr.next;
//	        }
//	        
//	        int temp;
//	        while(ptr!=null) {
//	        	temp=stk.pop();
//	        	if(temp!=ptr.val) {
//	        		return false;
//	        	}
//	        	ptr=ptr.next;
//	        }
//	        
//	        return true;
//	    }

	
    public static boolean isPalindrome(ListNode head) {
        boolean isOddLen = false;
        ListNode ptr=head, cpt=head;
        
        while(cpt!=null) {
        	if(cpt!=null) {
        		cpt=cpt.next;
        		isOddLen=true;
        		if(cpt!=null) {
        			isOddLen=false;
        			cpt=cpt.next;
        			ptr=ptr.next;
        		}
        	}
        }
        
        if(isOddLen) {
        	ptr=ptr.next;
        }
        
        
        cpt=reverseList(ptr);
        ptr=head;
        
        while(cpt!=null) {
        	if(cpt.val!=ptr.val) {
        		return false;
        	}
        	ptr=ptr.next;
        	cpt=cpt.next;
        }
        
        return true;
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

}
