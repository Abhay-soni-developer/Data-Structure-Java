package recursion;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class LRUCache {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		System.out.println(cache.get(2));
		cache.put(2, 6);
		System.out.println(cache.get(1));
		cache.put(1, 5);
		cache.put(1, 2);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));

	}

	private HashMap<Integer, Node> nodes = new HashMap<>();
	private int capacity;
	private Node head = null, tail = null;
	private int currentLength;

	class Node {
		int key;
		int value;
		Node next;
		Node prev;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}

	}

	public LRUCache(int capacity) {
		PriorityQueue<Integer> que = new PriorityQueue<>();
		this.capacity = capacity;
		this.currentLength = 0;
	}

	public int get(int key) {
		if (nodes.containsKey(key)) {
			Node node = nodes.get(key);
			if(this.head==node) {
				if(tail==head) {
					return node.value;
				}
				head=head.next;
			}else if(node==this.tail){
				return node.value;
			}else {
				node.prev.next=node.next;
			}
			this.tail.next=node;
			node.next=null;
			node.prev=tail;
			this.tail=this.tail.next;
			return tail.value;
		}
		return -1;
	}

    public void put(int key, int value) {
        if(nodes.containsKey(key)) {
        	Node node = nodes.get(key);
        	node.value=value;
        	if(node==this.head) {
        		if (head==tail) {
					return;
				}
        		this.head=this.head.next;
        		this.head.prev=null;
        	}else if(node==tail) {
        		return;
        	}else {
        		node.prev.next=node.next;
        	}
    		tail.next=node;
    		node.prev=tail;
    		node.next=null;
    		this.tail=this.tail.next;
        }else {
        	Node newNode = new Node(key, value);
        	nodes.put(key, newNode);
        	
            if(this.currentLength==this.capacity) {
        		int headKey = this.head.key;
        		this.head=this.head.next;
        		nodes.remove(headKey);
        	}else if(this.currentLength<this.capacity){
        		this.currentLength++;
        	}
            
            
        	if(head==null && tail==null) {
        		newNode.prev=null;
        		this.head=newNode;
        		this.tail=newNode;
        	}else {
        		this.tail.next=newNode;
        		newNode.prev=this.tail;
                this.tail=this.tail.next;
               
        	}
        	
        }
    }

}
