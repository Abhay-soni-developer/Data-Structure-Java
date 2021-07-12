package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
	static HashMap<Character, char[]> map = new HashMap<>() {{
		put('2', "abc".toCharArray());
		put('3', "def".toCharArray());
		put('4', "ghi".toCharArray());
		put('5', "jkl".toCharArray());
		put('6', "mno".toCharArray());
		put('7', "pqrs".toCharArray());
		put('8', "tuv".toCharArray());
		put('9', "wxyz".toCharArray());
	}};
	
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}

	public static List<String> letterCombinations(String digits) {	
		List<String> combination = new ArrayList<>();
		if(digits.length()==0) return combination;
		buildCombination(digits, 0, combination, new StringBuilder());
		return combination;
	}
	
	private static void buildCombination(String digits, int counter, List<String> result, StringBuilder lastComputedString) {
		if(counter>=digits.length()) {
			result.add(lastComputedString.toString());
			return;
		}
		
		char[] list = map.get(digits.charAt(counter));
		
		if(list==null) {
			buildCombination(digits, counter+1, result, lastComputedString);
			return;
		}
		
		for(int i=0; i<list.length; i++) {
			buildCombination(digits, counter+1, result, lastComputedString.append(list[i]));
			lastComputedString.deleteCharAt(lastComputedString.length()-1);
		}
		
	}

}
