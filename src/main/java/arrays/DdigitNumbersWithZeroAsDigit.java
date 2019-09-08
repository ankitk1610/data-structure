package arrays;

/*
 * 
 * https://www.geeksforgeeks.org/count-d-digit-positive-integers-with-0-as-a-digit/
 * 
 */

public class DdigitNumbersWithZeroAsDigit {

	public static void main(String[] args) {
		int n = 5;
		System.out.println((int) countNumbers(n));
	}

	private static int countNumbers(int d) {
		double ans = 9 * (Math.pow(10, d - 1) - Math.pow(9, d - 1));

		return (int) ans;

	}
}
