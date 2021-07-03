package recursion;

import java.util.ArrayList;

public class PowerSet {

	public static void main(String[] args) {
		String[] elementList = {"a", "b", "c", "d"};
		System.out.println(PowerSet.getPowerSet(0, elementList, "", new ArrayList<String>()).toString());
		System.out.println(PowerSet.getPowerSetTech2(0, elementList, "", new ArrayList<String>()).toString());
	}
	
	public static ArrayList<String> getPowerSet(int count, String[] elementList, String lastComputedNode, ArrayList<String> list) {
//		list.add(lastComputedNode);
		if(count==elementList.length) {
			list.add(lastComputedNode);
			return null;
		}
		
			PowerSet.getPowerSet(count+1, elementList, lastComputedNode.concat(elementList[count]), list);
			PowerSet.getPowerSet(count+1, elementList, lastComputedNode.concat(""), list);
		
		return list;
	}
	
	
	public static ArrayList<String> getPowerSetTech2(int count, String[] elementList, String lastComputedNode, ArrayList<String> list) {
		list.add(lastComputedNode);
		if(count==elementList.length) {
			return null;
		}
		
			for(int i=count; i<elementList.length; i++) {
				PowerSet.getPowerSet(i+1, elementList, lastComputedNode.concat(elementList[i]), list);
			}
		
		return list;
	}

}