package arrays;
/*
 * 
 * https://www.geeksforgeeks.org/find-two-rectangles-overlap/
 * 
 * 
 */

class Point {
	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

public class OverlappingRectangle {

	public static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {

		if (l1.getX() > r2.getX() || l2.getX() > r1.getX()) {
			return false;
		}

		if (l1.getY() < r2.getY() || l2.getY() < r1.getY()) {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {

		Point l1 = new Point(0, 10);
		Point r1 = new Point(10, 0);
		Point l2 = new Point(5, 5);
		Point r2 = new Point(15, 0);

		System.out.println(doOverlap(l1, r1, l2, r2));

	}

}
