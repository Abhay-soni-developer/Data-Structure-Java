package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;


public class FindPossiblePartners {

	public static void main(String[] args) {
		String input = "123456";
		System.out.println(findPossibleUniquePartnerGroupCount(input.length()));
		ArrayList<String> list = findPossibleUniquePartnerGroup(input, "");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static int findPossibleUniquePartnerGroupCount(int n) {

		if (n > 2) {
			return findPossibleUniquePartnerGroupCount(n - 1) + ((n - 1) * findPossibleUniquePartnerGroupCount(n - 2));
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}

		return 0;
	}

	private static ArrayList<String> findPossibleUniquePartnerGroup(String partnerList, String str) {
		ArrayList<String> result = new ArrayList<>();
		
		if(partnerList.length()>2) {
			String primaryNode = partnerList.substring(0, 1);
			String secondaryPartners = partnerList.substring(1, partnerList.length());
			ArrayList<String> partialResult = findPossibleUniquePartnerGroup(secondaryPartners, primaryNode);
			result.addAll(partialResult);
			String[] secondaryPartnerList = secondaryPartners.split("");
			for(int i=0; i<secondaryPartners.length(); i++) {
				String str1 = primaryNode+secondaryPartners.substring(i, i+1);
				String newPartnerList = "";
				for(int k=0; k<secondaryPartners.length(); k++) {
					if(secondaryPartnerList[i]==secondaryPartnerList[k]) continue;
					newPartnerList=newPartnerList+secondaryPartnerList[k];
				}
				partialResult = findPossibleUniquePartnerGroup(newPartnerList, str1);
				result.addAll(partialResult);
			}
		}
		else if(partnerList.length()==2) {
			String temp = partnerList.substring(0,1)+"-"+partnerList.substring(1,2);
			result.add(temp);
			result.add(partnerList);
		}else if(partnerList.length()==1){
			result.add(partnerList);
		}
		
	
		if(str.length()>0) {
			Iterator<String> itr = result.iterator();
			int index = 0;
			while(itr.hasNext()) {
				String temp = itr.next();
				temp=temp+"-"+str;
				result.set(index, temp);
				index++;
			}
		}
		return result;
	}
}
