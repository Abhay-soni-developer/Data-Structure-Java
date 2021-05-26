package recursion;

public class MyStack {
	private int top=-1;
	private int[] arr = null;
	
	public MyStack(int a) {
		arr=new int[a];
	}
	
	public MyStack() {
		arr=new int[10];
	}
	
	public int peek() {
		if(this.top==-1) {
			throw new Error("Stack is empty");
		}else {
			return this.arr[top];
		}
	}
	
	public int pop() {
		if(this.top==-1) {
			throw new Error("Stack is empty");
		}else {
			return this.arr[top--];
		}
	}
	
	public int push() {
		if(this.top==this.arr.length-1) {
			throw new Error("Stack is full");
		}else {
			return this.arr[top--];
		}
	}
	
	public int size() {
		return this.arr.length;
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}

}
