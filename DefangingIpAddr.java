package recursion;

import java.util.Iterator;

public class DefangingIpAddr {

	public static void main(String[] args) {
		System.out.println(defangIPaddr("11.1.1.1"));
	}

	public static String defangIPaddr(String address) {
		StringBuilder stb = new StringBuilder();
		String[] st = address.split("\\.");
		for(int n=0; n<st.length; n++) {
			stb.append(st[n]);
			if(n<st.length-1) {
				stb.append("[.]");
			}
		}
		
		return stb.toString();
	}
}