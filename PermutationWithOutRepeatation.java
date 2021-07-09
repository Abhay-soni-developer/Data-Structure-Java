package recursion;

import java.util.ArrayList;

public class PermutationWithOutRepeatation {

	public static void main(String[] args) {
		ArrayList<String> elementList = new ArrayList<>();
		elementList.add("a");
		elementList.add("b");
		elementList.add("c");
		elementList.add("d");
		System.out.println(PermutationWithOutRepeatation.getSet(new ArrayList<String>(), elementList, "", ""));
	}
	
	public static ArrayList<String> getSet(ArrayList<String> nodelist, ArrayList<String> elementList, String lastComputedChar, String lastComputedNode) {
		if(elementList.size()==1) {
			nodelist.add(lastComputedNode);
			return null;
		}

		ArrayList<String> elList = new ArrayList<>(elementList);
		int index=elList.indexOf(lastComputedChar);
		if(index!=-1) {
			elList.remove(index);
		}
		for(String ch:elList) {
			PermutationWithOutRepeatation.getSet(nodelist, elList, ch, lastComputedNode.concat(ch));
		}
		
		return nodelist;
	}

}
