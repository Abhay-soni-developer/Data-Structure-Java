package recursion;

import java.util.Arrays;

public class AdditionOfBinaryNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 9 };
//		ListNode ls1 = new ListNode(arr);
		String a = "abhay";
		StringBuilder stb = new StringBuilder();
		stb.append('a');
		stb.insert(0, 'b');
		stb.append('c');
		System.out.println(stb);
	}

	public static ListNode add1(ListNode head) {

		return head;
	}

	public static int parseBinary(String str) {
		int temp = 0;
		int size = str.length() - 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				temp += Math.pow(2, size);
			}
			size--;
		}
		return temp;
	}

	public static int[] addBinary(char a, char b, char c) {
        int[] res=new int[2];
        char[] ch = {a,b,c};
       
        switch(String.valueOf(ch)) {
            case "000":
                res[0]=0;
                res[1]=0;
                return res;
            case "001":
            case "010":
            case "100":
                res[0]=1;
                res[1]=0;
                return res;
            case "110":
                case "011":
            case "101":
                res[0]=0;
                res[1]=1;
                return res;
            case "111":
                res[0]=1;
                res[1]=1;
                return res;
            default:
                res[0]=0;
                res[1]=0;
                return res;
        }
    }
}
