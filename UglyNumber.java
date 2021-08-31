package recursion;

public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(isUgly(0));
	}
	
    public static boolean isUgly(int n) {
    	if(n==1 || n==0) {
    		return true;
    	}
    	
    	int i=2;
    	while(n!=1 && i<=5) {
    		if(n%i==0) {
    			n/=i;
    		}else {
    			i++;
    		}
    	}
    	if(i>5) return false;
    	return true;
    }

}
