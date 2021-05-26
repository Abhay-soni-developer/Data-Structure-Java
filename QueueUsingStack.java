package recursion;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> primaryStack = new Stack<>();
	Stack<Integer> secondaryStack = new Stack<>();
	boolean lastOperationWasPush;
	
	
	public static void main(String[] args) {

		
		
		
	}
	
    /** Initialize your data structure here. */
    public QueueUsingStack() {
    	this.primaryStack = new Stack<>();
    	this.secondaryStack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	if(!lastOperationWasPush) {
    		shiftElemToOtherStackInReverseOrder(secondaryStack, primaryStack);
    	}
    	lastOperationWasPush=true;
        primaryStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(lastOperationWasPush) {
    		shiftElemToOtherStackInReverseOrder(primaryStack, secondaryStack);
    	}
    	lastOperationWasPush=false;
    	return secondaryStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	if(lastOperationWasPush) {
    		shiftElemToOtherStackInReverseOrder(primaryStack, secondaryStack);
    	}
    	lastOperationWasPush=false;
    	return secondaryStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(primaryStack.isEmpty() && secondaryStack.isEmpty()) {
        	return true;
        }
        return false;
    }
	
	
	private static void shiftElemToOtherStackInReverseOrder(Stack<Integer> s1, Stack<Integer> s2) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
	}

}
