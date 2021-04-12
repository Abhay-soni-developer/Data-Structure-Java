package recursion;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		rotate(arr, -2);
		
		for(int n:arr) {
			System.out.println(n);
		}
	}

//	public static void rotate(int[] arr, int k) {
//		
//		if(k<0) {
//			k=arr.length+k;
//		}
//		
//		int size = arr.length;
//		while(k>0) {
//			int cv;
//			int nv=arr[size-1];
//			for(int i=0, c=0; c<size; i++, c++) {
//				cv=arr[i];
//				arr[i]=nv;
//				nv=cv;
//			}
//			k--;
//		}
//	}
	
	
	public static void rotate(int[] arr, int k) {
		
		if(k<0) {
			k=arr.length+k;
		}
		
		int[] arr1 = new int[arr.length];
		int size = arr.length;
		for(int i=0, c=k; i<size; i++, c++) {
			arr1[c%size]=arr[i];
		}
		for(int i=0; i<size; i++) {
			arr[i]=arr1[i];
		}
	}

}
