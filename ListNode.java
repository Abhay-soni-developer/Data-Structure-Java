package recursion;

import java.util.Arrays;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	ListNode(int[] arr) {
		this.val=arr[0];
		if(arr.length>1) {
			this.next=new ListNode(Arrays.copyOfRange(arr, 1, arr.length));
		}
	}
	
	public boolean insertAt(int val, int idx) {
		ListNode dummy = this;
		while(dummy!=null && idx!=0) {
			dummy=dummy.next;
			idx--;
		}
		
		if(idx==0) {
			dummy.next=new ListNode(val, dummy.next);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder stb = new StringBuilder();
		ListNode dummy = this;
		
		while(dummy!=null) {
			stb.append(dummy.val);
			stb.append(", ");
			dummy=dummy.next;
		}
		
		return stb.toString();
	} 
	
	public boolean insertAfter(int val, int after) {
		ListNode dummy = this;
		
		while(dummy!=null) {
			
			if(dummy.val==after) {
				dummy.insertAt(val, 0);
				return true;
			}
			
			dummy=dummy.next;
		}
		
		return false;
	}
	
	public static ListNode insertBefore(ListNode h1, int val) {
		ListNode newNode = new ListNode(val);
		newNode.next=h1;
		return newNode;
	}
	
	public static ListNode cloneList(ListNode head) {
		ListNode newList = new ListNode(head.val);
		ListNode dummy = newList;
		while(head.next!=null) {
			head=head.next;
			dummy.next=new ListNode(head.val);
			dummy=dummy.next;
		}
		return newList;
	}
	
	public void insertInMiddle(int val) {
		ListNode ptr1=this, ptr2=this;
		
		while(ptr2!=null) {
			if(ptr2.next!=null && ptr2.next.next!=null) {
				ptr2=ptr2.next.next;
				ptr1=ptr1.next;
			}else {
				ptr2=null;
			}
		}
		
		ptr2=ptr1.next;
		ptr1.next=new ListNode(val, ptr2);
	}
	
	public static int getLength(ListNode head) {
		int len=0;
		
		while(head!=null) {
			len++;
		}
		
		return len;
	}
	
	
	
}
