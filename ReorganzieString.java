package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//public class ReorganzieString {
//
//	public static void main(String[] args) {
//		String str = "aabbccddee";
//		System.out.println(reorganizeString(str));
//	}
//
//	public static String reorganizeString(String s) {
//		
//		if(s.length()<=1) {
//			return s;
//		}
//		
//		int[] counts = new int[26];
//				
//		for (int i = 0; i < s.length(); i++) {
//			counts[s.charAt(i) - 'a']++;
//		}
//		
//		PriorityQueue<CharCount> chCount = new PriorityQueue<>();
//		
//		for(int i=0; i<counts.length; i++) {
//			if(counts[i]>0) {
//				chCount.add(new CharCount((char)(i+(int)'a'), counts[i]));
//			}
//		}
//		
//		StringBuilder stb = new StringBuilder();
//		
//		while(!chCount.isEmpty()) {
//			CharCount ch = chCount.remove();
//			if(stb.length()>0 && stb.charAt(stb.length()-1)==ch.ch) {
//				if(chCount.isEmpty()) return "";
//				CharCount ch1 = chCount.remove();
//				stb.append(ch1.ch);
//				ch1.count--;
//				if(ch1.count>0) {
//					chCount.add(ch1);
//				}
//				chCount.add(ch);
//				continue;
//			}
//			stb.append(ch.ch);
//			ch.count--;
//			if(ch.count>0) {
//				chCount.add(ch);
//			}
//
//		}
//	
//		return new String(stb);
//	}
//}
//
//class CharCount implements Comparable<CharCount>{
//	int count;
//	char ch;
//	
//	@Override
//	public int compareTo(CharCount o) {
//		// TODO Auto-generated method stub
//		return o.count-this.count;
//	}
//	
//	CharCount(char ch, int count) {
//		this.ch=ch;
//		this.count=count;
//	}
//	
//	@Override
//	public String toString() {
//		return this.ch + " " + this.count;
//	}
//}


public class ReorganzieString {

	public static void main(String[] args) {
		String str = "eqpspvbpppwpgyppppe";
		System.out.println(reorganizeString(str));
	}
	
    public static String reorganizeString(String s) {
        if(s.length() == 1) return s;
        int[] freq = new int[26];
        int max=1,  maxLetter=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a'] > max){
                max = freq[ch-'a'];   
                maxLetter = ch-'a';
            }
        }
        
        if(max > (s.length()+1)/2){
            return "";
        }
        
        char res[] = new char[s.length()];
        int index=0;
        
        while(freq[maxLetter]-- > 0){
            res[index] = (char)('a'+maxLetter);
            index = index +2;
        }
        
        printArray(res);
        
        for(int i=0;i<freq.length;i++){
            while(freq[i]-- > 0){
                if(index >= s.length()){
                    index=1;
                }
                res[index] = (char)('a' + i);
                index = index +2;
            }
            printArray(res);
        }
        return new String(res);
    }
    
    
    public static void printArray(char[] ch ) {
    	for(int i=0; i<ch.length; i++) {
    		System.out.print(ch[i]+", ");
    	}
    	System.out.println("");
    }
}