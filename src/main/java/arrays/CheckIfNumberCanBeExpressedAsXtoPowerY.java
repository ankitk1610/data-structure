package arrays;
/*
 * 
 * https://www.geeksforgeeks.org/check-if-a-number-can-be-expressed-as-xy-x-raised-to-power-y/
 * 
 */

public class CheckIfNumberCanBeExpressedAsXtoPowerY {

	public static void main(String[] args) {
		int a = 8;
		int b = 9;
		int c = 10;
		System.out.println(a + " " + isXtoPowerY(a));

		System.out.println(b + " " + isXtoPowerY(b));

		System.out.println(c + " " + isXtoPowerY(c));

	}

	private static boolean isXtoPowerY(int a) {
		// TODO Auto-generated method stub

		if (a <= 2)
			return false;

		for (int i = 2; i*i <= a; i++) {
			double val = Math.log(a) / Math.log(i);
			if (val - (int) val < 0.00001)
				return true;
		}

		return false;
	}
}
