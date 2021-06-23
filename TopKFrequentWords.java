package recursion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentWords {

	public static void main(String[] args) {
		String[] strs = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		System.out.println(TopKFrequentWords.topKFrequent(strs, 4));
	}
	
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String str:words) {
        	if(map.getOrDefault(str, -1)==-1) {
        		map.put(str, 1);
        	}else {
        		map.put(str, map.get(str)+1);
        	}
        }
        
        PriorityQueue<ElementCount> heap = new PriorityQueue<>();
        Iterator itr = map.keySet().iterator();
        
        while(itr.hasNext()) {
        	String temp=(String) itr.next();
        	ElementCount ec = new ElementCount(temp, map.get(temp));
        	heap.add(ec);
        }
        
        LinkedList<String> res = new LinkedList<>();
        
        while(k!=0) {
        	res.add(heap.remove().str);
        	k--;
        }
        
        return res;
    }

}


class ElementCount implements Comparable<ElementCount> {
	int freq;
	String str;
	
	@Override
	public int compareTo(ElementCount o) {
		if(o.freq-this.freq==0) {
			return this.str.compareToIgnoreCase(o.str);
		}
		return o.freq-this.freq;
	}
	
	public ElementCount(String str, int freq) {
		this.freq=freq;
		this.str=str;
	}
}