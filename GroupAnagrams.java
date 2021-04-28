package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
//		String[] strs = {"tin","ram","zip","cry","pus","jon","zip","pyx"};
		List<List<String>> groups = groupAnagrams(strs);
		
		Iterator itr = groups.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
//    public static List<List<String>> groupAnagrams(String[] strs) {
//    	List<List<String>> groups = new ArrayList<>();
//    	HashMap<String, Integer> mapGroupToIdx = new HashMap<>();
//    	int idx=0;
//    	
//    	for(int i=0; i<strs.length; i++) {
//    		String temp = getCountArray(strs[i]);
//    		int crtStringGroupIdx = mapGroupToIdx.getOrDefault(temp, -1);
//    		if(crtStringGroupIdx!=-1) {
//    			groups.get(crtStringGroupIdx).add(strs[i]);
//    		}else {
//    			mapGroupToIdx.put(temp, idx);
//    			groups.add(idx, new ArrayList<>());
//    			groups.get(idx).add(strs[i]);
//    			idx++;
//    		}
//    	}
//    	
//    	return groups;
//    }
//    
    public static String getCountArray(String str) {
    	byte[] countRecord = new byte[26];
    	for(int i=0; i<str.length(); i++) {
    		countRecord[str.charAt(i)-'a']++;
    	}
    	
    	return Arrays.toString(countRecord);
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
    	HashMap<String, LinkedList<String>> mapGroupToKey = new HashMap<>();
    	
    	for(String str:strs) {
    		String key = getCountArray(str);
    		LinkedList<String> list = mapGroupToKey.get(key);
    		if(list!=null) {
    			list.add(str);
    		}else {
    			mapGroupToKey.put(key, new LinkedList<>());
    			mapGroupToKey.get(key).add(str);
    		}
    	}
    	
    	List<List<String>> groups = new LinkedList<>(mapGroupToKey.values());
    	
    	return groups;
    }
	
//  public static List<List<String>> groupAnagrams(String[] strs) {
//	HashMap<String, LinkedList<String>> mapGroupToKey = new HashMap<>();
//	
//	for(String str:strs) {
//		char[] temp = str.toCharArray();
//		Arrays.sort(temp);
//		String key = Arrays.toString(temp);
//		LinkedList<String> list = mapGroupToKey.get(key);
//		if(list!=null) {
//			list.add(str);
//		}else {
//			mapGroupToKey.put(key, new LinkedList<>());
//			mapGroupToKey.get(key).add(str);
//		}
//	}
//	
//	List<List<String>> groups = new LinkedList<>(mapGroupToKey.values());
//	
//	return groups;
//}

}
