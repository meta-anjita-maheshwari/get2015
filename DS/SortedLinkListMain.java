package Assignments;

/**
 * Write a program to insert a number in sorted LinkList. 
 * Use recursive approach.  
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Anjita
 * class implementing function in Sorted linked list
 */
public class SortedLinkListMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Integer> linkedList = new LinkedList<Integer>();// Linked List
		int choice = 0;
		int size = 0;
		int number = 0;
		SortedLinkList operation = new SortedLinkList();
		// Insert elements in list
		System.out.println("Enter number of elements to be added");
		size = operation.checkingInteger(size);
		System.out.println("Enter elements to add");
		for (int i = 0; i < size; i++) {
			number = operation.checkingInteger(number);
			linkedList.add(number);
		}
		linkedList.sort(null);// sorting initial linked list
		do {
			// menu
			System.out
					.println("Enter 1 to insert an element in Sorted Linked List "
							+ "\n2 Display the linked list"+"\n3 for exit"+"\nEnter your choice");
			choice = operation.checkingInteger(choice);
			switch (choice) {
			case 1:
				System.out.println("Enter Integer Number to insert :");
				//number = sc.nextInt();
				number = operation.checkingInteger(number);
				operation.insert(number, linkedList);
				break;
			case 2:
				System.out.println("Linked List is: ");
				operation.display(linkedList);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Enter Correct Choice");
			}

		} while (choice != 3);
		sc.close();
	}

}
