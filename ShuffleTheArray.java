package recursion;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int[] arr = {2,5,1,3,4,7};
		arr = shuffle(arr, 3);
		
		for(int n:arr) {
			System.out.println(n);
		}
	}
	
	
	public static int[] shuffle(int[] nums, int n) {
        int p1=0;
        int p2=n;
        int[] res = new int[nums.length];
        int i=0;
        while(n>0) {
            res[i]=nums[p1];
            p1++;
            i++;
            res[i]=nums[p2];
            p2++;
            i++;
            n--;
        }
        
        return res;
    }

}
