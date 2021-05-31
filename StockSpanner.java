package recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class StockSpanner {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 10, 18, 22 };
		StockSpanner ss = new StockSpanner();

		for (int n : arr) {
			System.out.println(ss.next(n));
		}
	}

	private int idx;
//	private Stack<Integer> list = null;
//	Stack<Integer> weight = null; good approach

	private Stack<Pair> list = null;

	public StockSpanner() {
		this.list = new Stack<>();
//		this.weight = new Stack<>(); 
		this.idx = -1;
	}

//	Good Approach
//	public int next(int price) {
//		int count=1;
//		
//		while(true) {
//			
//			if(list.isEmpty()) {
//				list.push(price);
//				weight.push(count);
//				break;
//			}
//			
//			if(list.peek()>price) {
//				list.push(price);
//				weight.push(count);
//				break;
//			}else if(list.peek()<=price){
//				list.pop();
//				count=count+weight.pop();
//			}
//		}
//		
//		return count;
//	}

// Reduced space complexity
	public int next(int price) {
		idx++;
		int result;
		while (true) {

			if (list.isEmpty()) {
				list.add(new Pair(price, idx));
				return idx + 1;
			}

			if (list.peek().price <= price) {
				list.pop();
			} else {
				int temp = idx - list.peek().idx;
				list.add(new Pair(price, idx));
				return temp;
			}
		}
	}

}

class Pair {
	int price;
	int idx;

	public Pair(int price, int idx) {
		this.price = price;
		this.idx = idx;
	}
}
