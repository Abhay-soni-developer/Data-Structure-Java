package recursion;

import java.util.PriorityQueue;

public class TaskScheduler {

	public static void main(String[] args) {
		char[] tasks = { 'A','A','A','A','A','A','B','C','D','E','F','G' };
		System.out.println(leastInterval(tasks, 2));
	}


	public static int leastInterval(char[] tasks, int n) {
		if (n == 0) {
			return tasks.length;
		}
		
		int[] taskFreq = new int[26];
		PriorityQueue<TaskCount> heap = new PriorityQueue<>();
		Result res = new Result();
		
		for (int i = 0; i < tasks.length; i++) {
			taskFreq[(int) tasks[i] - 'A']++;
		}
		
		for (int i = 0; i < taskFreq.length; i++) {
			if (taskFreq[i] > 0) {
				res.totalTaskRemaining+=taskFreq[i];
				heap.add(new TaskCount((char) (i + (int) 'A'), taskFreq[i]));
			}
		}
		
		while(!heap.isEmpty()) {
			leastInterval(heap, n, res);
		}
		

		return res.totalUnitTimeRequired;
	}
	
	public static void  leastInterval(PriorityQueue<TaskCount> heap, int n, Result res) {
		
		if(res.totalTaskRemaining==0) {
			return;
		}
		
		if(n>=0) {
			res.totalUnitTimeRequired++;
			if(!heap.isEmpty()) {
				TaskCount tc = heap.remove();
				tc.qty--;
				res.totalTaskRemaining--;
				n--;
				leastInterval(heap, n, res);
				if(tc.qty>0) {
					heap.add(tc);
				}
			}else {
				n--;
				leastInterval(heap, n, res);
			}
		}
		
		return;
	}
	
	
}

class TaskCount implements Comparable<TaskCount> {
	char task;
	int qty;

	@Override
	public int compareTo(TaskCount o) {
		return o.qty - this.qty;
	}

	@Override
	public String toString() {
		return this.qty + " " + this.task;
	}

	public TaskCount(char task, int qty) {
		this.task = task;
		this.qty = qty;
	}
}


class Result {
	public  int totalUnitTimeRequired;
	public  int totalTaskRemaining;
	
	public Result() {
		this.totalUnitTimeRequired=0;
		this.totalTaskRemaining=0;
	}
}
