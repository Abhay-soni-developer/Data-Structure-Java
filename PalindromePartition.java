package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

	public static void main(String[] args) {
		System.out.println(partition("nitin"));
	}

	public static List<List<String>> partition(String s) {
		List<List<String>> result = new ArrayList<>();
		ArrayList<String> list = new ArrayList<String>();
		String str = s;
		list.add(str);
		palindromePartition(result, list);
		return result;
	}

	private static void palindromePartition(List<List<String>> result, ArrayList<String> preResult) {
		String str = preResult.get(preResult.size() - 1);

		if (isPalindrome(str)) {
			result.add(preResult);
		}

		int length = str.length();
		if (length == 1)
			return;

		for (int i = 1; i < length; i++) {
			String str0 = str.substring(0, i);

			if (isPalindrome(str0)) {
				ArrayList<String> res = new ArrayList<>(preResult);
				res.remove(res.size() - 1);
				res.add(str0);
				String str1 = str.substring(i);
				res.add(str1);
				palindromePartition(result, res);
			}

		}
	}

	public static boolean isPalindrome(String str) {
		char[] arr = str.toCharArray();
		int length = str.length();
		int start = 0;
		int end = length - 1;
		while (start < end) {
			if (arr[start] == arr[end]) {
				start++;
				end--;
				continue;
			}
			return false;
		}
		return true;
	}

}
