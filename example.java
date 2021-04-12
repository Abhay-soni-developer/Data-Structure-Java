package recursion;

public class example {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<=(arr.length/2); i++) {
			int len = arr.length-1;
			int a = arr[i];
			arr[i] = arr[len-i];
			arr[len-i] = a;
		}
		
		for(int i:arr) {
			System.out.println(i + " ");
		}
		
	}
}
