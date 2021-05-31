package recursion;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		MinStack stack = new MinStack();

		stack.push(2147483646);
		stack.push(2147483646);
		stack.push(2147483647);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		stack.push(2147483647);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.push(-2147483648);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
	}

	private Stack<Integer> stack = null;
	private int minValue;

	public MinStack() {
		stack = new Stack<>();
	}

	public void push(int val) {
		if (stack.isEmpty()) {
			this.minValue = val;
		} else if (val < this.minValue) {
			int temp = val;
			val = (2 * val) - this.minValue;
			this.minValue = temp;
		}
		stack.push(val);
	}

	public void pop() {
		int temp = stack.pop();
		if (temp < 0 && this.minValue < 0 && temp > this.minValue) {
			this.minValue = this.minValue-temp+this.minValue;
		} else if (temp < this.minValue) {
			this.minValue = this.minValue-temp+this.minValue;
		}
	}

	public int top() {
        int temp=stack.peek();
        if((temp < 0 && this.minValue < 0 && temp > this.minValue) || (temp<this.minValue)){
            return (temp+this.minValue)/2;
        }
        return temp;
    }

	public int getMin() {
		return this.minValue;
	}

	@Override
	public String toString() {
		return this.stack.toString();
	}
}
