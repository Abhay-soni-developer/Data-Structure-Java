package recursion;

import java.util.Stack;

public class BasicCalculator {

	public static void main(String[] args) {
		String expression = "2-1+2";
		System.out.println(calculate(expression));
	}

	public static int calculate(String s) {
		Stack<Integer> operands = new Stack<>();
		Stack<Character> operators = new Stack<>();
		char op = ' ';
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp >= 48 && temp <= 57) {
				operands.push(((int) temp) - 48);
			} else if (temp == ' ') {
				continue;
			} else {
				if(!operators.isEmpty() && operators.peek()=='+' && temp=='-') {
					int b = operands.pop();
					int a = operands.pop();
					operands.push(cal(a, b, operators.pop()));
				}
				if(!operators.isEmpty() && operators.peek()=='-' && temp=='+') {
					int b = operands.pop();
					int a = operands.pop();
					operands.push(cal(a, b, operators.pop()));
				}
				operators.push(temp);
			}

			if (!operators.isEmpty() && operators.peek() == ')') {
				operators.pop();
				op = operators.pop();
				while (op != '(') {
					int b = operands.pop();
					int a = operands.pop();
					operands.push(cal(a, b, op));
					op = operators.pop();
				}
				op = ' ';
			}
		}
		

		while (!operators.isEmpty()) {
			op = operators.pop();
			int b = operands.pop();
			int a = operands.pop();
			operands.push(cal(a, b, op));
		}

		return operands.pop();
	}

	public static int cal(int a, int b, char operand) {
		if (operand == '+') {
			return a + b;
		} else if (operand == '-') {
			return a - b;
		}

		return 0;
	}
}
