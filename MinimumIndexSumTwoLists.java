package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class MinimumIndexSumTwoLists {

	public static void main(String[] args) {
		String[] list1 = { "Shogun","Tapioca Express","Burger King","KFC", "abhay" };
		String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun", "raksha" ,"abhay"};

		System.out.println(Arrays.toString(findRestaurant(list1, list2)));
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		if (list2.length > list1.length) {
			return findRestaurant(list2, list1);
		}

		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();

		int i = 0;
		int minIdx = Integer.MAX_VALUE;
		
		while (i < list1.length) {
			map.put(list1[i], i);
			i++;
		}

		i = 0;

		while (i < list2.length) {
			int idx = map.getOrDefault(list2[i], -1);

			if (idx != -1) {
				int temp = idx + i;
				
				if(minIdx==temp) {
					list.add(list2[i]);
				}else if(minIdx>temp) {
					minIdx=temp;
					list.clear();
					list.add(list2[i]);
				}
			}

			i++;
		}


		String[] res = list.toArray(new String[0]);
		return res;
	}

}
