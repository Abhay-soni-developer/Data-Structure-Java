package recursion;

public class DeleteColToMakeSorted {

	public static void main(String[] args) {
		String[] strs = {"zyx","wvu","tsr"};
		System.out.println(minDeletionSize(strs));
	}

    public static int minDeletionSize(String[] strs) {
    	if(strs.length==1) {
    		return 0;
    	}
    	
    	int notSortedCol = 0;
        
        for(int j=0; j<strs[0].length(); j++) {
        	int lastChar=(int)strs[0].charAt(j);
        	for(int i=1; i<strs.length; i++) {
        		if((int)strs[i].charAt(j)<lastChar) {
        			notSortedCol++;
        			break;
        		}
        		lastChar=(int)strs[i].charAt(j);
        	}
        }
        
    	return notSortedCol;
    }
    
}
