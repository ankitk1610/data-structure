package arrays;

/*
 * 
 * https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
 * 
 */
public class CountNumberOfWaysToReachTillEnd {
	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		System.out.println(countWays(m, n));
	}

	private static int countWays(int m, int n) {
		// TODO Auto-generated method stub
		int mat[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			mat[i][0] = 1;
		}

		for (int i = 0; i < n; i++) {
			mat[0][i] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				mat[i][j] = mat[i][j - 1] + mat[i - 1][j];
			}
		}
		return mat[m - 1][n - 1];
	}

}
