/**
 * DS Session8: question no 2
 */
package Assignments;

import java.util.Scanner;

/**
 * @author Anjita
 * a sorting system, which takes input from user and provide a sorted list. Here
 * User could choose if he want to go with Comparison Sorting Or Linear Sorting.
 */
public class SortClassMain {
	public static void main(String args[]) {
		ComparisonSort cSort = new ComparisonSort();
		LinearSort lSort = new LinearSort();
		SortOperations operations = new SortOperations();
		String choice;
		int input[] = null, output[];
		int no_Of_digit = 0;
		Scanner scanner = new Scanner(System.in);
		do {

			System.out.println("-----Menu-----");
			System.out.println("1. Inserting elements");
			System.out.println("2. Linear Sort");
			System.out.println("3. Comparison Sort");
			System.out.println("4. Exit");
			choice = scanner.next();

			switch (choice) {
			case "1":
				input = operations.insertElement();
				break;

			case "2":
				System.out.println("Linear Sort");
				no_Of_digit = lSort.maximumDigit(input);
				if (no_Of_digit <= 2) {
					System.out.println("Counting Sort");
					output = lSort.countingSort(input);
					operations.display(output);
				} else {
					System.out.println("Radix Sort");
					output = lSort.radixSort(input);
					operations.display(output);
				}
				break;

			case "3":
				System.out.println("Comparison Sort");
				if (input.length < 10) {
					System.out.println("Bubble Sort");
					output = cSort.bubbleSort(input);
					operations.display(output);
				} else {
					System.out.println("Quick Sort");
					output = cSort.quickSort(0, input.length - 1, input);
					operations.display(output);
				}
				break;

			case "4":
				scanner.close();
				return;
			default:
				break;
			}
		} while (true);

	}

}