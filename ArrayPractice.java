package recursion;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr = {1,4,6,78,3,5,8,9,2,9};
		shiftElement(1, 5, arr);
		
		for(int el:arr) {
			System.out.println(el);
		}
	}
	
	public static int[] shiftElement(int from, int to, int[] arr) {
		int temp = arr[from];
		
		for(int i=from; i<to; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[to]=temp;
		
		return arr;
	}

}
