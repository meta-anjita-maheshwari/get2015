package Assignments;

/**
 * @author Anjita this class represents the Binary Search Tree.
 */
public class BinarySearchTree {
	int i = 0;
	int preOrder[] = new int[10];
	int size = 0;
	int postOrder[] = new int[10];
	// Reference for the root of the tree.
	public Node<Integer> root;
	public Node<Integer> binaryRoot;

	/**
	 * @param value
	 *            is inserted in binary tree
	 * @return
	 */
	public BinarySearchTree insert(int value) {
		Node<Integer> node = new Node<Integer>(value);

		if (root == null) {
			root = node;
			return this;
		}

		insertRecursively(root, node);
		return this;
	}

	/**
	 * @param latestRoot
	 *            :- node that is set as root recently
	 * @param node
	 *            :- that has to be inserted in tree
	 */
	private void insertRecursively(Node<Integer> latestRoot, Node<Integer> node) {

		if (latestRoot.value > node.value) {

			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else {
				insertRecursively(latestRoot.left, node);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertRecursively(latestRoot.right, node);
			}
		}
	}

	/**
	 * @param value
	 *            is inserted in image binary tree
	 * @return
	 */
	public BinarySearchTree insertImage(int value) {
		Node<Integer> node = new Node<Integer>(value);

		if (binaryRoot == null) {
			binaryRoot = node;
			return this;
		}

		insertImageRecursively(binaryRoot, node);
		return this;
	}

	/**
	 * @param latestRoot
	 *            :- node that is set as root recently
	 * @param node
	 *            :- that has to be inserted in tree
	 */
	private void insertImageRecursively(Node<Integer> latestRoot,
			Node<Integer> node) {

		if (latestRoot.value > node.value) {

			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertRecursively(latestRoot.right, node);
			}
		} else {
			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else {
				insertRecursively(latestRoot.left, node);
			}
		}
	}

	/**
	 * Printing the contents of the tree in an inorder way.
	 */
	public void printInorder() {
		printInOrderRecursively(root);
		System.out.println("");
	}

	/**
	 * @param currRoot
	 *            :- root of subtree Helper method to recursively print the
	 *            contents in an inorder way
	 */
	private void printInOrderRecursively(Node<Integer> currRoot) {
		if (currRoot == null) {
			return;
		}
		printInOrderRecursively(currRoot.left);
		System.out.print(currRoot.value + ", ");
		printInOrderRecursively(currRoot.right);
	}

	/**
	 * Printing the contents of the tree in a Preorder way.
	 */
	public void printPreorder() {
		printPreOrderRecursively(root);
		System.out.println("");
	}

	/**
	 * @param currRoot
	 *            :- root of subtree Helper method to recursively print the
	 *            contents in a Preorder way
	 */
	private void printPreOrderRecursively(Node<Integer> currRoot) {
		if (currRoot == null) {
			return;
		}
		System.out.print(currRoot.value + ", ");
		preOrder[i++] = currRoot.value;
		size++;
		printPreOrderRecursively(currRoot.left);
		printPreOrderRecursively(currRoot.right);
	}

	/**
	 * Printing the contents of the tree in a Postorder way.
	 */
	public void printPostorder() {
		printPostOrderRecursively(root);
		System.out.println("");
	}

	/**
	 * @param currRoot
	 *            :- root of subtree Helper method to recursively print the
	 *            contents in a Postorder way
	 */
	private void printPostOrderRecursively(Node<Integer> currRoot) {
		if (currRoot == null) {
			return;
		}
		printPostOrderRecursively(currRoot.left);
		printPostOrderRecursively(currRoot.right);
		System.out.print(currRoot.value + ", ");
		postOrder[i++] = currRoot.value;

	}

	/**
	 * @return true if two trees are mirror image
	 */
	public boolean checkMirrorImageCondition() {
		return checkMirrorImageCondition(root, binaryRoot);
	}

	/**
	 * @param node
	 *            :- binary tree node
	 * @param nodeImage
	 *            :- image binary tree node
	 * @return true if two trees are mirror image
	 */
	private boolean checkMirrorImageCondition(Node node, Node nodeImage) {

		int flag = 0;
		int j = size - 1;
		for (int i = 0; i < size; i++) {
			if (preOrder[i] == postOrder[j]) {
				j--;
			} else {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			return true;

		return false;

	}
}
