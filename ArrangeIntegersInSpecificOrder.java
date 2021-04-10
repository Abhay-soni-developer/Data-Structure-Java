package recursion;

public class ArrangeIntegersInSpecificOrder {

	public static void main(String[] args) {
		int[] arr = {1,2,8,9,5,5,5};
		arrange(arr, 0, true);
		for(int el:arr) {
			System.out.println(el);
		}

	}
	
	
	public static int[] arrange(int[] arr, int count, boolean shouldBeGreaterThan) {
		boolean flag=false;
		if(shouldBeGreaterThan) {
			flag = arr[count]>arr[count+1];
		}else {
			flag = arr[count]<arr[count+1];
		}
		if(flag) {
			swap(count, count+1, arr);
		}
		
		if(count<arr.length-2) {
			arrange(arr, count+1, !shouldBeGreaterThan);
		}
		
		return arr;
	}
	
	public static void swap(int to, int from, int[] arr) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}

}
