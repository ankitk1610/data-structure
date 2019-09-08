package arrays;

import java.util.Stack;

/*
 * 
 * https://www.geeksforgeeks.org/find-the-nearest-smaller-numbers-on-left-side-in-an-array/
 * 
 */

public class NearestSmallElementOnLeft {

	public static void nearestSmall(int[] arr) {
		// {1, 6, 4, 10, 2, 5}
		// {_, 1, 1, 4, 1, 2}

		Stack<Integer> stack = new Stack();
		int top = 0;
		for (int i = 0; i < arr.length; i++) {

			if (stack.isEmpty()) {
				System.out.print("_, ");

			}

			else {
				top = stack.peek();
				if (top >= arr[i]) {
					while (!stack.isEmpty() && stack.peek() >= arr[i]) {
						stack.pop();
					}
					if (stack.isEmpty()) {
						System.out.print("_, ");
					} else {
						System.out.print(stack.peek() + ", ");
					}

				} else {
					System.out.print(stack.peek() + ", ");
				}

			}
			stack.push(arr[i]);
		}

		return;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 4, 10, 2, 5 };

		nearestSmall(arr);

	}

}
