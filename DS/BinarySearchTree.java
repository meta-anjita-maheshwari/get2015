/**
 * DS Session8: question no 1
 */
package Assignments;

/**
 * @author Anjita this class represents the Binary Search Tree.
 */
public class BinarySearchTree {

	public Node<Integer> root;
	String sort="";
	/**
	 * @param value :-
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
		} else if (latestRoot.value < node.value){
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertRecursively(latestRoot.right, node);
			}
		}
	}

	/**
	 * Printing the contents of the tree in an inorder way.
	 */
	public String printInorder() {
		String sorted=printInOrderRecursively(root);
		System.out.println("");
		return sorted;
	}

	/**
	 * @param currRoot
	 *            :- root of subtree Helper method to recursively print the
	 *            contents in an inorder way
	 */
	private String printInOrderRecursively(Node<Integer> currRoot) {
		if (currRoot == null) {
			return null;
		}
		printInOrderRecursively(currRoot.left);
		System.out.print(currRoot.value + ", ");
		sort+=currRoot.value;
		sort+=",";
		printInOrderRecursively(currRoot.right);
		return sort;
	}

}