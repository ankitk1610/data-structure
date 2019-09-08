package arrays;

import java.util.Stack;

/*
 * 
 * https://www.geeksforgeeks.org/build-lowest-number-by-removing-n-digits-from-a-given-number/
 * 
 */
public class SmallestNumberByRemovingNDigits {

	public static void main(String[] args) {
		String s = "4325043";
		int n = 3;
		String ans = getSmallest(s, n);
		System.out.println("Original String " + s);

		System.out.println("Greatest number after removing " + n + " digits: " + ans);
	}

	private static String getSmallest(String s, int n) {
		Stack<Character> myStack = new Stack();

		for (int i = 0; i < s.length(); i++) {
			if ((myStack.isEmpty() || myStack.peek() < s.charAt(i)) && myStack.size() <= n) {
				myStack.push(s.charAt(i));
			} else {
				
				while (!myStack.isEmpty() && myStack.peek() > s.charAt(i) && n > 0 ) {
					myStack.pop();
					n--;
				}
				myStack.push(s.charAt(i));
			}
		}

		String ans = "";
		while (!myStack.isEmpty()) {
			ans = myStack.pop() + ans;
		}
		return ans;

	}

}
