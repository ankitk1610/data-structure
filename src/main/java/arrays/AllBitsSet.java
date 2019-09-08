package arrays;

public class AllBitsSet {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(isAllBitsSet(n));
		
		int k = 7;
		System.out.println(isAllBitsSet(k));
	}

	private static boolean isAllBitsSet(int n) {
		return ((n & n+1) == 0);
		
		
	}
}
