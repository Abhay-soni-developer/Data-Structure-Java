package recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.List;

public class GenerateValidParentheses {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		Iterator<String> itr = GenerateValidParentheses.getValidParentheses(3).iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(counter);
	}

	public static List<String> getValidParentheses(int n) {
		char[] str = new char[n*2];
		ArrayList<String> result= new ArrayList<>();
		GenerateValidParentheses.generateValidParentheses(n, 0, 0, str, result);
		return result;
	}

	private static void generateValidParentheses(int n, int placedOpenBracketsCount, int placedClosedBracketsCount,
			char[] str, ArrayList<String> result) {
		
		if (placedOpenBracketsCount == n && placedClosedBracketsCount == n) {
			result.add(String.valueOf(str));
			return;
		}
counter++;

		if (placedOpenBracketsCount < n) {
			str[placedOpenBracketsCount+placedClosedBracketsCount] = '(';
			generateValidParentheses(n, placedOpenBracketsCount + 1, placedClosedBracketsCount, str, result);
			str[placedOpenBracketsCount+placedClosedBracketsCount] = ' ';
		}

		if (placedClosedBracketsCount < placedOpenBracketsCount) {
			str[placedOpenBracketsCount+placedClosedBracketsCount] = ')';
			generateValidParentheses(n, placedOpenBracketsCount, placedClosedBracketsCount + 1, str, result);
			str[placedOpenBracketsCount+placedClosedBracketsCount] = ' ';
		}

	}

}
