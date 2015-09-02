package Assignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program the binary search function and its loop invariants in a way 
 * so that it will always find the leftmost occurrence of x in the array in case the occurrences are not unique 
 * (if it is actually in the array, −1 as before if it is not).
 */

/**
 * @author Anjita
 * 
 */
public class BinarySearchMain {

	public static void main(String[] args) {
		int size = 0, max = 0, min = 0;
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		size = scanner.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter array element");
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		max = size - 1;
		do {
			System.out.println("Enter searching element");
			int searchingElement = scanner.nextInt();
			BinarySearch object = new BinarySearch();

			int result = object.binarySearch(searchingElement, min, max, array);
			if (result == -1) {
				System.out.println("searching element not found");

			} else {
				System.out.println("searching element Left occurrence is: "
						+ object.leftOccurrenceOfElement(searchingElement,
								result, array));
			}

			System.out.println("Enter 1 if want to continue " + "else press 0");
			temp = scanner.nextInt();

		} while (temp == 1);

		scanner.close();

	}

}
