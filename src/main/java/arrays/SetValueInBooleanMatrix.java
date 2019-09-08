package arrays;
/*
 * 
 * https://www.geeksforgeeks.org/a-boolean-matrix-question/
 * 
 */

public class SetValueInBooleanMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };

		System.out.println("Before Manipulation : ");
		printMatrix(mat);
		System.out.println("After Manipulation : ");

		setBit(mat);

	}

	private static void setBit(int[][] mat) {
		// TODO Auto-generated method stub

		boolean rowFlag = false;
		boolean columnFlag = false;

		for (int i = 0; i < mat.length; i++) {
			if (mat[i][0] == 1) {
				columnFlag = true;
				break;
			}
		}

		for (int i = 0; i < mat[0].length; i++) {
			if (mat[0][i] == 1) {
				rowFlag = true;
				break;
			}
		}

		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[0].length; j++) {
				if (mat[i][j] == 1) {
					mat[0][j] = 1;
					mat[i][0] = 1;
				}
			}
		}

		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[0].length; j++) {
				mat[i][j] = (mat[0][j] == 1 || mat[i][0] == 1) ? 1 : mat[i][j];
			}
		}

		if (rowFlag) {
			for (int i = 0; i < mat[0].length; i++) {
				mat[0][i] = 1;
			}
		}

		if (columnFlag) {
			for (int i = 0; i < mat.length; i++) {
				mat[i][0] = 1;
			}
		}

		printMatrix(mat);

	}

	private static void printMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
