package recursion;

public class JewelsAndStones {

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	}
	
	
	public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsList = jewels.toCharArray();
        char[] stonesList = stones.toCharArray();
        int count = 0;
        for(int i=0; i<stonesList.length; i++) {
        	for(int j=0; j<jewelsList.length; j++) {
        		if(stonesList[i]==jewelsList[j]) {
        			count++;
        			break;
        		}
        	}
        }
        
        return count;
    }

}
