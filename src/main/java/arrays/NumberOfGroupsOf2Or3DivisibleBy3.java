package arrays;

/*
 * 
 * https://www.geeksforgeeks.org/count-possible-groups-size-2-3-sum-multiple-3/
 * 
 */
public class NumberOfGroupsOf2Or3DivisibleBy3 {

	private static int countGroups(int nums[]) {
		int ans = 0;
		int count[] = new int[3];

		for (int i = 0; i < nums.length; i++) {
			count[nums[i] % 3]++;
		}

		int a = count[0];
		int b = count[1];
		int c = count[2];
// group of 2 : 
		// case 1 : both remainders 0

		ans += a * (a - 1) / 2;

		// case 2 : 1 remainder 1, 1 remainder 2
		ans += b * c;

// group of 3
		// case 1 : 3 from remainder 0
		ans += a * (a - 1) * (a - 2) / 6;

		// case 2 : 1 from remainder 0, 1 from remainder 1 , 1 from remainder 2
		ans += a * b * c;

		// case 3 : 3 from remainder 1

		ans += b * (b - 1) * (b - 2) / 6;

		// case 4 : 3 from remainder 2
		ans += c * (c - 1) * (c - 2) / 6;

		return ans;

	}

	public static void main(String[] args) {

		int arr[] = { 3, 6, 7, 2, 9 };
		System.out.println(countGroups(arr));
	}

}
