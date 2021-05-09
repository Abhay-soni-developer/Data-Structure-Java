package recursion;


public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode ls3 = new ListNode(3);
		ListNode ls2 = new ListNode(4, ls3);
		ListNode ls1 = new ListNode(2, ls2);

		ListNode rs3 = new ListNode(4);
		ListNode rs2 = new ListNode(6, rs3);
		ListNode rs1 = new ListNode(5, rs2);

		ListNode temp = addTwoNumbers(ls1, rs1);

		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carryOver = 0, temp = 0, d1 = 0, d2 = 0;
		ListNode res = null;

		while (l1 != null || l2 != null || carryOver==1) {

			if (l1 != null) {
				d1 = l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				d2 = l2.val;
				l2 = l2.next;
			}

			temp = d1 + d2 + carryOver;
			carryOver = temp / 10;
			temp %= 10;
			d1 = 0;
			d2 = 0;
			
			res = new ListNode(temp, res);
		}
		ListNode res1 = null;
		while(res!=null) {
			res1 = new ListNode(res.val, res1);
			res=res.next;
		}

		return res1;
	}

}

