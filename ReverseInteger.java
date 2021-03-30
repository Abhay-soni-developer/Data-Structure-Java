package recursion;

import java.util.Stack;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-121));
	}

	public static int reverse(int x) {
		int res = 0;

		while (x!=0) {
			int temp = x % 10;
			x = x / 10;
			if (res > (Integer.MAX_VALUE / 10) || (res == Integer.MAX_VALUE / 10 && temp > 7))
				return 0;
			if (res < (Integer.MIN_VALUE / 10) || (res == Integer.MIN_VALUE / 10 && temp < -8))
				return 0;
			res=res*10+temp;
		}

		return res;

	}

}
