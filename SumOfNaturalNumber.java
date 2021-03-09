package recursion;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		System.out.println(SumOfNaturalNumber.getSumOfNaturalNumbers(3));
	}
	
	private static int getSumOfNaturalNumbers(int n) {
		if(n==1) return 1;
		return n + getSumOfNaturalNumbers(n-1);
	}
}
