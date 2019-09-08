package arrays;

/*
 * 
 * https://www.geeksforgeeks.org/print-possible-strings-can-made-placing-spaces/
 * 
 * 
 */

public class AllPossibleString {

	public static void allStrings(String s) {
		char[] charArray = new char[2 * s.length()];

		int i = 1;
		int j = 1;
		charArray[0] = s.charAt(0);
		allStringsUtil(s, i, j, charArray);

	}

	private static void allStringsUtil(String s, int i, int j, char[] charArray) {
		// TODO Auto-generated method stub
		if (i == s.length()) {
			charArray[j] = '\0';
			System.out.println(charArray);
			return;
		}

		charArray[j] = s.charAt(i);
		allStringsUtil(s, i + 1, j + 1, charArray);

		charArray[j] = ' ';
		charArray[j + 1] = s.charAt(i);

		allStringsUtil(s, i + 1, j + 2, charArray);

	}

	public static void main(String[] args) {
		String s = "ABCD";
		allStrings(s);

	}

}
