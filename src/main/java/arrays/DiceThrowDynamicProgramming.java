package arrays;
/*
 * 
 * https://www.geeksforgeeks.org/dice-throw-dp-30/
 * 
 */
public class DiceThrowDynamicProgramming {
	public static void main(String[] args) {
		int faces = 6;
		int dice = 3;
		int sum = 7;
		System.out.println(countNumberOfWays(faces,dice,sum));
	}

	private static int  countNumberOfWays(int faces, int dice, int sum) {

		int[][] dp = new int[dice+1][sum+1];
		
		
		
		
		return 0;
	}

}
