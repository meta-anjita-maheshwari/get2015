/**
 * DS Session8: question no 1
 */
package Assignments;

import java.util.Scanner;

/**
 * @author Anjita this class receive roll number of student in any order and
 *         prints roll number in ascending order using TREE SORT.
 */

public class BinarySearchTreeMain {
	BinarySearchTree binarySearchTree = new BinarySearchTree();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinarySearchTreeMain binarySearch = new BinarySearchTreeMain();
		binarySearch.input();
		binarySearch.output();
	}

	/**
	 * takes roll number from user
	 */
	public void input() {
		String no = "";
		int number = 0;
		String regex = "[0-9]+";
		System.out.println("Enter Roll numbers of students in any order");
		System.out.println("Press 'stop' to stop");
		do {
			System.out.println("Enter roll number");
			no = sc.nextLine();
			while (!(no.matches(regex))) {
				if (no.equalsIgnoreCase("stop")) {
					break;
				}
				System.out.println("This is not a number, Please enter again");
				no = sc.nextLine();
			}
			if (!(no.equalsIgnoreCase("stop"))) {
				number = Integer.parseInt(no);
				binarySearchTree.insert(number);
			}
		} while (!(no.equalsIgnoreCase("stop")));

	}

	/**
	 * shows roll numbers in ascending order
	 */
	public void output() {
		System.out.println("Roll numbers in ascending order are:-");
		binarySearchTree.printInorder();
	}

}
