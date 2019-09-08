package arrays;

/*
 * 
 * https://www.geeksforgeeks.org/position-of-rightmost-set-bit/
 * 
 */
public class RightMostSetBit {

	public static int findRightMostSetBit(int n) {
		if(n == 0) {
			return -1;
		}

		return (int) ((Math.log(n & -n) / Math.log(2)) + 1);
	}

	public static void main(String[] args) {
		System.out.println(findRightMostSetBit(12));
	}

}
