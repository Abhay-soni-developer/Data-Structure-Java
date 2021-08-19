package recursion;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		
		int[] res =productExceptSelf(arr);
		
		for(int n:res) {
			System.out.println(n);
		}

	}


//	public static int[] productExceptSelf(int[] arr) {
//		int[] front = prefixProductArrayFront(arr);
//		int[] back = prefixProductArrayBack(arr);
//
//		for (int i = 0; i < arr.length; i++) {
//			int f = 1, b = 1;
//
//			if (i - 1 > -1) {
//				f = front[i - 1];
//			}
//
//			if (i + 1 < arr.length) {
//				b = back[i + 1];
//			}
//
//			arr[i] = f * b;
//		}
//		
//		return arr;
//	}
	
	
	public static int[] productExceptSelf(int[] arr) {
		
	int[] res = new int[arr.length];
	res[0]=1;
	
	for (int i = 1; i < arr.length; i++) {
		res[i]=res[i-1]*arr[i-1];
	}
	
	int suffix=arr[arr.length-1];
	
	for(int i=arr.length-2; i>=0; i--) {
		res[i]=res[i]*suffix;
		suffix=suffix*arr[i];
	}
	
	return res;
}

//	public static int[] prefixProductArrayFront(int[] arr) {
//		int[] res = new int[arr.length];
//		res[0] = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			res[i] = res[i - 1] * arr[i];
//		}
//
//		return res;
//	}
//
//	public static int[] prefixProductArrayBack(int[] arr) {
//		int[] res = new int[arr.length];
//		res[arr.length - 1] = arr[arr.length - 1];
//		for (int i = arr.length - 2; i >= 0; i--) {
//			res[i] = res[i + 1] * arr[i];
//		}
//
//		return res;
//	}

}
