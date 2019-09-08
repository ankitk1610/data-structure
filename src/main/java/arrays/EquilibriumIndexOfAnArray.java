package arrays;

/*
 * 
 * https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 * 
 */
public class EquilibriumIndexOfAnArray {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		findEqulilibriumIndex(arr);
		
		int arr1[] = { 1,2,3 };
		findEqulilibriumIndex(arr1);
		
	}

	private static void findEqulilibriumIndex(int[] arr) {
		// TODO Auto-generated method stub

		int[] leftSumArray = new int[arr.length];
		leftSumArray[0] = 0;
		for (int i = 1; i < arr.length; i++) {
			leftSumArray[i] = leftSumArray[i - 1] + arr[i - 1];
		}

		for (int i = 0; i < leftSumArray.length; i++)
			System.out.print(leftSumArray[i] + " ");

		System.out.println();
		for (int i = arr.length - 2; i >= 0; i--) {
			leftSumArray[i] = leftSumArray[i + 1] - arr[i + 1] - arr[i];
			if (leftSumArray[i] == 0) {
				System.out.println("Value : " + leftSumArray[i] + " , index : " + i);
			}
		}
		for (int i = 0; i < leftSumArray.length; i++)
			System.out.print(leftSumArray[i] + " ");
		
		
		System.out.println();

	}

}
