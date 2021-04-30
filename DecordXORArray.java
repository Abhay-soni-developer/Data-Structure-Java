package recursion;


public class DecordXORArray {

	public static void main(String[] args) {
//		int[] a = {1,2,3};
//		int[] b = decode(a, 1);
//		
//		for(int c:b) {
//			System.out.println(c);
//		}
		
		System.out.println(xorOperation(5, 0));;

	}

	public static int[] decode(int[] encoded, int first) {
		int[] decoded = new int[encoded.length + 1];
		decoded[0] = first;
		for (int i = 1; i < decoded.length; i++) {
			decoded[i] = encoded[i - 1] ^ decoded[i - 1];
		}

		return decoded;
	}

	public static int xorOperation(int n, int start) {
		int[] arr = new int[n];
		int res = start;
		for(int i=0; i<arr.length; i++) {
			arr[i]= start+(2*i);
			if(i>=1 && i<arr.length) {
				res=res^arr[i];
			}
		}
		
		return res;
	}
}
