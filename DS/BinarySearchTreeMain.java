package Assignments;

import java.util.Scanner;

/**
 * @author Anjita
 * this class shows the three traversing method of binary tree
 * 1. Inorder traversal
 * 2. Preorder traversal
 * 3. Postorder traversal
 */
public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter element of binary tree");
		System.out.println("Press -1 to stop");
		int no = sc.nextInt();
		while (no != -1) {
			binarySearchTree.insert(no);
			System.out.println("Enter another element");
			no = sc.nextInt();
		}
		do {
			System.out.println("enter 1 for Inorder traversal");
			System.out.println("enter 2 for Preorder Traversal");
			System.out.println("enter 3 for Postorder Traversal");
			System.out.println("enter 4 for exit");
			System.out.println("enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Inorder traversal");
				binarySearchTree.printInorder();
				break;
			case 2:
				System.out.println("Preorder Traversal");
				binarySearchTree.printPreorder();
				break;
			case 3:
				System.out.println("Postorder Traversal");
				binarySearchTree.printPostorder();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter correct choice");
			}
		} while (choice != 4);
		sc.close();
	}

}
