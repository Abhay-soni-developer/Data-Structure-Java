package recursion;

public class PatternBuilder {
	public static void main(String[] args) {
		PatternBuilder.pattern2(5);
	}
	
	private static void printPattern(int n) {
		System.out.println(n*n+", ");
		
		if(n<=1) {
			return;
		}
		
		if(n==2) {
			printPattern(1);
			return;
		}
		
		int b=n-1;
		
		printPattern(b);
		
		int c=n-2;
		if(c>=2) printPattern(c);
		
	}
	
	
	private static void printPattern1 (int n) {
		if(n<=1 ) {
			System.out.print("1, ");
			return;
		}
		
		printPattern1(n-1);
		System.out.print(n*n+", ");
		if(n>2) {
			printPattern1(n-2);
		}
		
	}
	
	
	private static void pattern2(int n) {
		
		if(n>=3) {
			pattern2(n-2);
			pattern2(n-1);
		}
		System.out.print(n+", ");
	}
}
