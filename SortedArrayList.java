package recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class SortedArrayList extends ArrayList<Integer>{
	
	public int sortingAdd(int n) {
		Iterator<Integer> itr = this.iterator();
		int i=0;
		
		while(itr.hasNext()) {
			if(n>=(int)itr.next()) {
				break;
			}
			i++;
		}
		this.add(i,n);
		return i+1;
	}

}
