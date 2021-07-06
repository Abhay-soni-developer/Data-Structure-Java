package recursion;

public class SubsetFinder {

	public static void main(String[] args) {
		System.out.println(SubsetFinder.getSubsetByMarkedBits(5).length);
	}
	
	public int[][] subsetFinder(int size, int[] arr, int[][] subset, int count) {
		
		return subset;
	}
	
	public static String[] getSubsetByMarkedBits(int count) {
		String binaryDigit = Integer.toBinaryString(count);
		String[] bitArray = binaryDigit.split("");
		return bitArray;
	}

}