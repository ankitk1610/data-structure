package arrays;

import java.util.Arrays;

/*
 * 
 * https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
 * 
 */
public class CountTripletsWithSumLessThanGivenValue {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5, 10 };

		System.out.println(countTriplets(arr, 10));

		int[] arr1 = { 5, 1, 3, 4, 7 };

		System.out.println(countTriplets(arr1, 12));

		int[] arr2 = { -2, 0, 1, 3 };
		System.out.println(countTriplets(arr2, 2));

	}

	private static int countTriplets(int[] arr, int sum) {
		Arrays.sort(arr);
		int count = 0;
		int left;
		int right;
		for (int i = 0; i < arr.length - 1; i++) {
			left = i + 1;
			right = arr.length - 1;
			while (left < right) {
				if (arr[i] + arr[left] + arr[right] < sum) {
					count += right - left;
					left++;
				} else {
					right--;
				}
			}
		}

		return count;

	}
}
