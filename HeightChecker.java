package recursion;

import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOfRange(heights, 0, heights.length-1);
        Arrays.sort(sorted);
        int res=0;
        for(int i=0; i<heights.length; i++) {
        	if(sorted[i]!=heights[i]) {
        		res++;
        	}
        }
        return res;
    }

}
