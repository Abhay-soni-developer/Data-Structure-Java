package recursion;

import java.util.PriorityQueue;

class SeatManager {
	private PriorityQueue<Integer> heap = null;
	
	
	
    public SeatManager(int n) {
    	heap = new PriorityQueue<>();
    	for(int i=1; i<11; i++) {
    		heap.add(i);
    	}
    }
    
    public int reserve() {
    	return heap.remove();
    }
    
    public void unreserve(int seatNumber) {
    	heap.add(seatNumber);
    }
}
