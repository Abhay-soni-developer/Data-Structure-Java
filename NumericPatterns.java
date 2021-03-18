package recursion;

public class NumericPatterns {
	
	public static void main(String[] args) {
		System.out.println(NumericPatterns.pattern1(2));
	}
	
//	6.7.8+.....(n+5)(n+6)(n+7)
	public static int pattern1(int numOfStepToTake) {
		int n = numOfStepToTake;
		if(numOfStepToTake==0) {
			return 0;
		}
		return ((n+5)*(n+6)*(n+7)) + NumericPatterns.pattern1(numOfStepToTake-1);
	}

}
