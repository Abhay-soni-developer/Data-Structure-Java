package recursion;

public class Binary {

	public static void main(String[] args) {
		System.out.println(Binary.getBinary(15));
	}
	
	private static String getBinary(int num) {
		int rem = num%2;
		num = num/2;
		
		if(num==0) {
			return "1";
		}
		String str = Binary.getBinary(num);
		return str.concat(Integer.toString(rem));
	}

}
