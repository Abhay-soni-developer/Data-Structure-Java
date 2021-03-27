package recursion;

import java.util.Arrays;

public class Fibonacci {

	
    static int[] memoization = new int[31];
    
    static {
        Arrays.fill(memoization, -1);
    }
    
    public int fib(int n) {
        
        if(memoization[n]!=-1) {
            return memoization[n];
        }
        
        if(n==0) {
            return 0;
        }
        
        if(n==1 || n==2) {
            return 1;
        }
        
        memoization[n] = fib(n-2) + fib(n-1) ;
        return memoization[n];
    }
    
}
