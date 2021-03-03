package recursion;

public class Maths1 {

	public static void main(String[] args) {
		System.out.println(divide(0, 5));
	}

	
	   public static int divide(int num1, int num2) {
		      try {
		         num2 = num2 / num1;
		         System.out.println(num2);
		      }
		      catch (ArithmeticException e) { 
		         System.out.println("denominator can not be zero");
		         return -1;
		      }
		      catch (Exception e) {
		         System.out.println("Exception occurred");
		         return -1;
		      }
		      return num2;
		   }
}