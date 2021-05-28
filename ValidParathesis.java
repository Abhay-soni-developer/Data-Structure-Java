package recursion;

import java.util.Stack;

public class ValidParathesis {

	public static void main(String[] args) {
		String str = "]";
		System.out.println(isValid(str));
	}
//
//	public static boolean isValid(String s) {
//		StringBuilder stb = new StringBuilder();
//		
//		for (int i = 0; i < s.length(); i++) {
//
//			if (stb.length()==0) {
//				if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
//					return false;
//				}
//				stb.append(s.charAt(i));
//				continue;
//			}
//
//			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
//				stb.append(s.charAt(i));
//				continue;
//			}
//
//			if (s.charAt(i) == ')') {
//				if (stb.charAt(stb.length() - 1) == '(') {
//					stb.deleteCharAt(stb.length() - 1);
//					continue;
//				}
//			} else if (s.charAt(i) == ']') {
//				if (stb.charAt(stb.length() - 1) == '[') {
//					stb.deleteCharAt(stb.length() - 1);
//					continue;
//				}
//			} else if (s.charAt(i) == '}') {
//				if (stb.charAt(stb.length() - 1) == '{') {
//					stb.deleteCharAt(stb.length() - 1);
//					continue;
//				}
//			}
//			
//			return false;
//		}
//
//		if (stb.length() == 0) {
//			return true;
//		}
//
//		return false;
//
//	}

	public static boolean isValid(String s) {
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stk.push(s.charAt(i));
			} else {

				if (stk.isEmpty()) {
					return false;
				}

				if (s.charAt(i) == ')') {
					if (stk.peek() == '(') {
						stk.pop();
						continue;
					}
				} else if (s.charAt(i) == ']') {
					if (stk.peek() == '[') {
						stk.pop();
						continue;
					}
				} else if (s.charAt(i) == '}') {
					if (stk.peek() == '{') {
						stk.pop();
						continue;
					}
				}

				return false;
			}
		}

		if (stk.isEmpty()) {
			return true;
		}

		return false;
	}
}
