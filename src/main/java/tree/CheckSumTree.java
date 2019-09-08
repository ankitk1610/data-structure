package tree;

/*
 * 
 * https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
 * 
 */
public class CheckSumTree {

	public static boolean isSumTree(Node root) {
		if (root == null)
			return true;
		int lSum = 0;
		if (root.left != null)
			lSum = isLeafNode(root.left) ? root.left.data : 2 * root.left.data;

		int rSum = 0;
		if (root.right != null)
			rSum = isLeafNode(root.right) ? root.right.data : 2 * root.right.data;
		return (root.data == lSum + rSum && isSumTree(root.left) && isSumTree(root.right));

	}

	private static boolean isLeafNode(Node root) {
		return (root.left == null && root.right == null);
	}

	public static void main(String[] args) {

		Node root = new Node(26);
		root.left = new Node(10);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		root.right.left = new Node(3);
		root.right.right = new Node(3);

		String s = isSumTree(root) ? "Sum Tree." : "Not a Sum Tree.";

		System.out.println(s);
		/*
		 * 26 10 3 4 6 3
		 */
	}

}
