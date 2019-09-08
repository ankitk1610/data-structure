package arrays;
/*
 * 
 * https://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/
 * 
 */

public class NumberOfBitsToBeSwappedToEquate {
	public static void main(String[] args) {

		int a = 7;
		int b = 10;

		System.out.println(countBitsToEquate(a, b));

	}

	private static int countBitsToEquate(int a, int b) {
		// TODO Auto-generated method stub
		return countBits(a ^ b);
	}

	private static int countBits(int i) {
		// TODO Auto-generated method stub
		int ans = 0;
		while (i > 0) {
			if (i % 2 == 1)
				ans++;
			i /= 2;
		}
		return ans;
	}

}
