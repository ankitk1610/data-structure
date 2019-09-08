package tree;

public class CheckForBST {

	public static boolean isBSTUtil(Node root, int min, int max) {

		if (root == null) {
			return true;
		}

		if (root.getData() < min || root.getData() > max)
			return false;

		return (isBSTUtil(root.getLeft(), min, root.getData() - 1)
				&& isBSTUtil(root.getRight(), root.getData() + 1, max));

	}

	public static boolean isBST(Node root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
//		root.left.right = new Node(4);
		root.right = new Node(5);
		System.out.println(isBST(root));
	}

}
