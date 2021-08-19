package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class PickingLongestSubArrayWithDiffLessOrEqualToLimit {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66);
//		List<Integer> a = Arrays.asList(4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5, 97, 5, 97, 99, 4, 97, 5, 97, 97, 97, 5, 5, 97, 4, 5, 97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4, 97, 97, 4, 97, 5, 4, 4, 97, 97, 97, 5, 5, 97, 4, 97, 97, 5, 4, 97, 97, 4, 97, 97, 97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97, 97, 97, 4, 97, 5, 97, 5, 4, 97, 4, 5, 97, 97, 5, 97, 5, 97, 5, 97, 97, 97);
		
		System.out.println(pickingNumbers(a));
	}

	public static int pickingNumbers(List<Integer> arr) {
		int size=arr.size();
		HashMap<Integer, Integer> hm = new HashMap<>();
		int greatest=0;
		int key;
		
		for(int i=0; i<size; i++) {
			key=arr.get(i);
			hm.get(key);
			
			if(hm.get(key)==null) {
				hm.put(key, 1);
			}else {
				hm.put(key, hm.get(key)+1);
			}
			
		}
		
		key=0;
		Iterator it = hm.keySet().iterator();
		int[] uniq = new int[hm.size()];

//		System.out.println(hm);
		
		while(it.hasNext()) {
			uniq[key]=(int)it.next();
//			System.out.println(uniq[key]);
			key++;
		}
		
		if(uniq.length==1) {
			return hm.get(uniq[0]);
		}
		
		Arrays.sort(uniq);

		for(int i=0; i<uniq.length; i++) {
			
			if(uniq[i]-uniq[i+1]==-1) {
                int temp = hm.get(uniq[i])+hm.get(uniq[i+1]);
                
                if(temp>greatest) {
                    greatest=temp;
                }
            } else if(hm.get(uniq[i])>greatest) {
				greatest=hm.get(uniq[i]);
			}
			
        }
		
		return greatest;
	}

}
