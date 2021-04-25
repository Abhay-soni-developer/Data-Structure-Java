package recursion;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("a"));
	}

	public static boolean isPalindrome(String str) {
		char[] arr = str.toCharArray();
		String str1 = "";
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			int ch = (int) arr[i];

			if(ch>47 && ch<58) flag=true;

			if (ch > 64 && ch < 91) {
				ch = ch + 32;
				flag = true;
			}

			if (ch > 96 && ch < 123)
				flag = true;

			if (flag)
				str1 += (char) ch;
		}
		
        char[] arr1 = str1.toCharArray();
		int length = str1.length();
		int start = 0;
		int end = length-1;
		int till = (length/2)-1;
		while(start<=till) {
			if(arr1[start]==arr1[end]) {
				start++;
				end--;
				continue;
			}
			return false;
		}
		return true;
	}

//	private static int isPalindrome(String str, int length, int count) {
//		if (length == 1 || length == 0)
//			return 1;
//		char storedChar = str.charAt(count);
//		int compareToCharAtIndex = -1;
//		int flag = (int) (length / 2);
//		if (count < flag) {
//			compareToCharAtIndex = Palindrome.isPalindrome(str, length, count + 1);
//		}
//
//		if (count == flag - 1) {
//			if (length % 2 == 0) {
//				compareToCharAtIndex = count + 1;
//			} else {
//				compareToCharAtIndex = count + 2;
//			}
//		}
//
//		if (compareToCharAtIndex == -1)
//			return -1;
//
//		if (Character.compare(storedChar, str.charAt(compareToCharAtIndex)) == 0) {
//			return compareToCharAtIndex + 1;
//		} else {
//			return -1;
//		}
//	}
	
//	private static boolean isPalindrome(String str) {
//		char[] arr = str.toCharArray();
//		int length = str.length();
//		int start = 0;
//		int end = length-1;
//		int till = (length/2)-1;
//		System.out.println(till);
//		while(start<=till) {
//			if(arr[start]==arr[end]) {
//				start++;
//				end--;
//				continue;
//			}
//			return false;
//		}
//		
//		return true;
//	}

}
