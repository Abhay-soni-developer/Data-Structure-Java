package recursion;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class DenominationCombination {

	public static void main(String[] args) {
		ArrayList<Integer> denominationList = new ArrayList<Integer>();
		denominationList.add(1);
		denominationList.add(2);
		denominationList.add(3);
		denominationList.add(4);
		denominationList.add(5);
		denominationList.add(6);
		ArrayList<ArrayList<Integer>> list = DenominationCombination.getDenominationSet(denominationList, 5);
		
		for(ArrayList<Integer> tempList:list) {
			Collections.sort(tempList);
		}
		
		
		for(int i=0; i<list.size(); i++) {
			for(int j=i; j<list.size(); j++) {
				if(i!=j && list.get(i).size()==list.get(j).size()) {
					boolean exactMatch = Arrays.equals(list.get(i).toArray(new Integer[list.size()]), list.get(j).toArray(new Integer[list.size()]));
					if(exactMatch) {
						list.remove(j);
						j=j-1;
					}
				}
			}
		}
		
		for (ArrayList<Integer> tempList:list) {
			System.out.println(tempList);
		}
 	
		
		
	}
	
	public static ArrayList<ArrayList<Integer>> getDenominationSet(ArrayList<Integer> denominationList, int target) {
		return DenominationCombination.getDenominationSet(denominationList, target, 0, new ArrayList<Integer>(), new ArrayList<ArrayList<Integer>>());
	}
	
	public static ArrayList<ArrayList<Integer>> getDenominationSet(ArrayList<Integer> denominationList, int target, int lastComputedValue, ArrayList<Integer> currentList, ArrayList<ArrayList<Integer>> result) {
		if(target==lastComputedValue) {
			result.add(currentList);
			return null;
		}
		if(target<=lastComputedValue) {
			return null;
		}
		for(int denomination:denominationList) {
			ArrayList<Integer> newCurrencyList=new ArrayList<Integer>(currentList);
			newCurrencyList.add(denomination);
			DenominationCombination.getDenominationSet(denominationList, target, lastComputedValue+denomination, newCurrencyList, result);
		}
		return result;
	}

}
