package recursion;

public class MaxChunksToMakeSorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 0 };
		System.out.println(maxChunksToSorted(arr));
	}

	public static int maxChunksToSorted(int[] arr) {
		int count = 0;
		int i = 0;

		while (i < arr.length) {
			if (arr[i] == i) {
				count++;
				i++;
			} else {
				int largest = arr[i];
				i++;
				while (i <= largest) {
					if (largest < arr[i]) {
						largest = arr[i];
					}
					i++;
				}
				count++;
			}
		}

		return count;
	}

}
