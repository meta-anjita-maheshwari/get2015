/**
 * DS Session8: question no 2
 */
package Assignments;

import java.util.Scanner;

/**
 * @author Anjita
 * class to perform operations
 */
public class SortOperations {
	Scanner scanner = new Scanner(System.in);

	/**
	 * a function to insert elements in array
	 * 
	 * @return array
	 */
	public int[] insertElement() {
		int size = 0;
		System.out.println("Enter size of array");
		size = this.checkingInteger(size);
		int input[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter array element");
			input[i] = this.checkingInteger(input[i]);
		}
		return input;
	}

	/**
	 * a function for display
	 * 
	 * @param array
	 */
	public void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}

	/**
	 * checking input is integer or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :an integer value
	 */
	public int checkingInteger(int value) {

		do {// Validation

			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scanner.next();
			}
			value = scanner.nextInt();
		} while (value <= 0);
		return value;
	}

}
