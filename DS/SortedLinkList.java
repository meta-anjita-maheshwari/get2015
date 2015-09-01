package Assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Anjita
 *
 */
public class SortedLinkList {
	private int index = 0; // Starting index
	private Scanner scan = new Scanner(System.in);

	/**
	 * Recursive function to insert element in sorted list
	 * 
	 * @param element
	 *            :- element to insert
	 * @param list
	 *            :- list in which element to be added
	 */
	public void insert(int element, List<Integer> list) {
		if (index == list.size()) { // if index reached till end of list then
									// add directly at end of list
			list.add(element);
			index = 0;
		} else if ((int) list.get(index) < element) {// searching exact position
														// of element in list
			index = index + 1;
			insert(element, list);
		} else { // position found then add element
			list.add(index, element);
			index = 0;
		}

	}

	/**
	 * To display Elements of Linked List
	 * 
	 * @param list
	 *            :- Linked list of elements
	 */
	public void display(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		System.out.println("Elements are :");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * checking input is integer or not
	 * 
	 * @param value
	 *            :- value entered
	 * @return :- an integer value
	 */
	public int checkingInteger(int value) {
		do {
			while (!scan.hasNextInt()) {
				System.out.println("This is not a number, Please enter again");
				scan.next();
			}
			value = scan.nextInt();
		} while (value <= 0);
		return value;
	}

}
