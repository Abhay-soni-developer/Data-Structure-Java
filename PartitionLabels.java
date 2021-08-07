package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PartitionLabels {

	public static void main(String[] args) {
		String str = "ababcbacadefegdehijhklij";

		System.out.println(partitionLabels(str));
	}

//	public static List<Integer> partitionLabels(String S) {
//		List<Integer> list = new ArrayList<>();
//		HashMap<Character, Integer> countList = countEach(S);
//		HashMap<Character, Integer> activeCountList = (HashMap<Character, Integer>)countList.clone();
//		char[] ch = S.toCharArray();
//		int i=1;
//		for(char c:ch) {
//			if(activeCountList.put(c, activeCountList.get(c)-1)==1) {
//				if(canPartionBeDone(countList, activeCountList)) {
//					list.add(i);
//					i=0;
//				}
//			}
//			i++;
//		}
//	
//		return list;
//	}
//	
//	public static boolean canPartionBeDone(HashMap<Character, Integer> countList,  HashMap<Character, Integer> activeCountList) {
//		
//		Iterator itr = countList.keySet().iterator();
//		char ch;
//		while(itr.hasNext()) {
//			ch=(char)itr.next();
//			if(activeCountList.get(ch)==countList.get(ch) || activeCountList.get(ch)==0) {
//				
//			}else {
//				return false;
//			}
//			
//		}
//		
//		return true;
//	}
//	
//	public static HashMap<Character, Integer> countEach(String str) {
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//		char[] ch = str.toCharArray();
//		
//		for(char c:ch) {
//			if(map.get(c)==null) {
//				map.put(c, 1);
//			}else {
//				map.put(c, map.get(c)+1);
//			}
//		}
//		
//		return map;
//	}

//	public static List<Integer> partitionLabels(String str) {
//		List<Integer> res = new ArrayList<>();
//		int[] startPoints = new int[26];
//		Arrays.fill(startPoints, -1);
//		int[] endPoints = new int[26];
//		Arrays.fill(endPoints, -1);
//		int uniqueCharCounts = 0;
//		
//		for(int i=0; i<str.length(); i++) {
//			if(startPoints[(int)str.charAt(i)-(int)'a']==-1) {
//				startPoints[(int)str.charAt(i)-(int)'a']=i;
//				uniqueCharCounts++;
//			}
//			endPoints[(int)str.charAt(i)-(int)'a']=i;
//		}
//		
//		int[][] intervals = new int[uniqueCharCounts][2];
//		int temp=0;
//		
//		for(int i=0; i<startPoints.length; i++) {
//			if(startPoints[i]!=-1) {
//				intervals[temp][0]=startPoints[i];
//				intervals[temp][1]=endPoints[i];
////				System.out.println(Arrays.toString(intervals[temp]));
//				temp++;
//			}
//		}
//		
//		intervals = MergeIntervals.merge(intervals);
//		
//		for(int[] i:intervals) {
//			res.add(i[1]-i[0]+1);
//		}
//		
//		return res;
//	}

	public static List<Integer> partitionLabels(String str) {
		List<Integer> res = new ArrayList<>();
		int[] endPoints = new int[26];
		Arrays.fill(endPoints, -1);

		for (int i = 0; i < str.length(); i++) {
			endPoints[(int) str.charAt(i) - (int) 'a'] = i;
		}

		int i = 0;
		int len = 0;
		int endPoint = endPoints[(int) str.charAt(i) - (int) 'a'];

		while (i < str.length()) {

			if (endPoints[(int) str.charAt(i) - (int) 'a'] <= endPoint) {
				len++;
			} else if (endPoints[(int) str.charAt(i) - (int) 'a'] > endPoint) {
				endPoint = endPoints[(int) str.charAt(i) - (int) 'a'];
				len++;
			}
			if (endPoint == i) {
				res.add(len);
				len=0;
			}

			i++;
		}

		return res;
	}
}
