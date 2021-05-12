package recursion;

public class RemoveEveryKthNode {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		ListNode head = new ListNode(arr);
		head=removeEveryKthNode(head, 1);
		System.out.println(head);
	}
	
	
//	using loop
	public static ListNode removeEveryKthNode(ListNode head, int k) {
	
		if(k<=1) {
			return null;
		}
		
		ListNode res=head;
		
		int i=k;
		while(head!=null) {
			if(k==2 && head.next!=null) {
				head.next=head.next.next;
				k=i;
				head=head.next;
				continue;
			}
			head=head.next;
			k--;
		}
		
		return res;
	}
	
	
//	public static ListNode removeEveryKthNode(ListNode head, int k, int size) {
//
//		
//		if(k<=1 || size==0) {
//			return null;
//		}
//		
//		ListNode res=head;
//		
//		int i=k;
//		
//		while(i!=2 && res!=null) {
//			i--;
//			res=res.next;	
//		}
//		
//		if(res==null) {
//			return null;
//		}
//		
//		if(i==2 && res.next!=null) {
//			res.next=res.next.next;
//			res=res.next;
//			removeEveryKthNode(res, k, size-k);
//		}
//		
//		return res;
//	}

}
