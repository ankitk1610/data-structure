package arrays;

/*
 * 
 * https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
 * 
 */
public class CountFrequencyInSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 4, 5, 6, 6, 7, 8, 8, 8, 8, 9, 10 };
		String s = "Frequency of ";
		String is = " is ";

		String line = "=======================";

		System.out.println(s + 1 + is + findFrequency(arr, 1));
		System.out.println(line);
		System.out.println(s + 2 + is + findFrequency(arr, 2));
		System.out.println(line);
		System.out.println(s + 3 + is + findFrequency(arr, 3));
		System.out.println(line);
		System.out.println(s + 4 + is + findFrequency(arr, 4));
		System.out.println(line);

		System.out.println(s + 5 + is + findFrequency(arr, 5));
		System.out.println(line);
		System.out.println(s + 6 + is + findFrequency(arr, 6));
		System.out.println(line);
		System.out.println(s + 7 + is + findFrequency(arr, 7));
		System.out.println(line);
		System.out.println(s + 8 + is + findFrequency(arr, 8));
		System.out.println(line);
		System.out.println(s + 9 + is + findFrequency(arr, 9));
		System.out.println(line);
		System.out.println(s + 10 + is + findFrequency(arr, 10));
		System.out.println(line);

		System.out.println(s + 0 + is + findFrequency(arr, 0));

		System.out.println(line);
		System.out.println(s + 11 + is + findFrequency(arr, 11));

	}

	private static int findFrequency(int[] arr, int i) {
		int start = findStart(arr, i, 0, arr.length - 1);
		int end = findEnd(arr, i, 0, arr.length - 1);

		System.out.println("start index for: " + i + " is " + start);
		System.out.println("end index for: " + i + " is " + end);
		return end - start + 1;
	}

	private static int findEnd(int[] arr, int num, int start, int end) {
		if (end < start)
			return -1;
		if (end == start && arr[start] == num)
			return start;
		int mid = (start + end) / 2;
		if (arr[mid] == num) {
			if (num < arr[mid + 1])
				return mid;
			else
				return findEnd(arr, num, mid + 1, end);
		}

		if (num < arr[mid])
			return findEnd(arr, num, start, mid - 1);
		else
			return findEnd(arr, num, mid + 1, end);

	}

	private static int findStart(int[] arr, int num, int start, int end) {
		if (end < start)
			return -1;
		if (end == start && arr[start] == num)
			return start;
		int mid = (start + end) / 2;
		if (arr[mid] == num) {
			if (num > arr[mid - 1])
				return mid;
			else
				return findStart(arr, num, start, mid - 1);
		}

		if (num < arr[mid])
			return findStart(arr, num, start, mid - 1);
		else
			return findStart(arr, num, mid + 1, end);
	}

}
