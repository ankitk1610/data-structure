package arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		printArray(arr);
		System.out.println();
		rotateArrayRight(arr, 2);
		System.out.println("Rotating Right by 2..");
		printArray(arr);
		System.out.println();

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Rotating Left 2..");
		rotateArrayLeft(arr1, 2);
		printArray(arr1);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int gcd(int a, int b) {
		if (a % b == 0)
			return b;
		else
			return gcd(b, a % b);
	}

	private static void rotateArrayLeft(int[] arr, int d) {
		int g = gcd(arr.length, d);
//		System.out.println(g);
		int n = arr.length;

		for (int i = 0; i < g; i++) {

			int j = i;
			int temp = arr[j];

			int k = 0;
			while (true) {
				k = j + d;
				if (k >= n) {
					k -= n;
				}
				if (k == i)
					break;

				else {
					arr[j] = arr[k];
					j = k;
				}

			}
			arr[j] = temp;

		}

	}

	private static void rotateArrayRight(int[] arr, int d) {
		int g = gcd(arr.length, d);
//		System.out.println(g);
		int n = arr.length;

		for (int i = 0; i < g; i++) {

			int j = n - i - 1;
			int temp = arr[j];

			int k = 0;
//			int t = j-d;
			while (true) {
				k = j - d;
				if (k < 0) {
					k = k + n;
				}
				if (k == n - g - i + 1)
					break;

				else {
					arr[j] = arr[k];
					j = k;
				}

			}
			arr[j] = temp;

		}

	}

}
