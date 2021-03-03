package recursion;

public class PracticeString {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();
		System.out.println(stb.append('a'));
		System.out.println(stb.append('c'));
		System.out.println(stb.append('b'));
		System.out.println(stb.append('b'));
		System.out.println(stb.length());
		System.out.println(stb.substring(stb.lastIndexOf(",")+1, stb.length()));
		
	}

}
