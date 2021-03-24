package recursion;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryCombination {

	public static void main(String[] args) {
		System.out.println(BinaryCombination.getBinaryCombinationOfLength(3).toString());
	}
	
	public static ArrayList<String> getBinaryCombinationOfLength(int length) {
		ArrayList<String> nodeList = new ArrayList<>();
		return BinaryCombination.getBinaryCombinationOfLength(length, 0, "", nodeList);
	}
	
//	public static int getSummationOf2PowerSeries(int maxPower, int count, int lastComputedTerm) {
//		if(count==maxPower) {
//			return lastComputedTerm;
//		}
//		return lastComputedTerm + BinaryCombination.getSummationOf2PowerSeries(maxPower, count+1, lastComputedTerm*2);
//	}
	
	public static ArrayList<String> getBinaryCombinationOfLength(int length, int count, String lastComputedNode, ArrayList<String> computedNodes) {
//		System.out.println(lastComputedNode);
		if(length==count) {
			computedNodes.add(lastComputedNode);
			return null;
		}
		getBinaryCombinationOfLength(length, count+1, lastComputedNode.concat("0"), computedNodes);
		getBinaryCombinationOfLength(length, count+1, lastComputedNode.concat("1"), computedNodes);
		return computedNodes;
	}

}
