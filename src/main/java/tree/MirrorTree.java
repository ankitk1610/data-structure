package tree;
/*
 * 
 * https://www.geeksforgeeks.org/check-if-two-trees-are-mirror/
 * 
 */

public class MirrorTree {

	public static void main(String[] args) {
		Node a = new Node(1);

		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);

		Node b = new Node(1);
		b.left = new Node(3);
		b.right = new Node(2);
		b.right.left = new Node(5);
		b.right.right = new Node(4);

		System.out.println(isMirrorTree(a, b));
	}

	private static boolean isMirrorTree(Node a, Node b) {
		if (a == null && b == null)
			return true;

		if (a == null || b == null)
			return false;

		return a.data == b.data && isMirrorTree(a.right, b.left) && isMirrorTree(a.left, b.right);

	}

}
/*
 * 
 * A : 1 2 3 4 5
 * 
 * 
 * 
 * B : 1 3 2 5 4
 * 
 * 
 * 
 */