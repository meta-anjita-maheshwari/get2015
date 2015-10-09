/**
 * Implement generalized list collection in Java. An element of a generalized list can itself be a generalized list. Here is an example of a generalized list-

(5, (8, 3), (6, (10, 12), 4), 7)

The above list consists of four elements, the first and last elements are numbers, whereas second and third elements are themselves lists. 

You can assume that the atomic elements of the list are integers.

Implement the following methods for this collection:

a) Constructor to create an empty list.
b) Constructor that will take a string representing a generalized list; and will create the list accordingly. For example we can provide “(5, (8, 3), (6, (10, 12), 4), 7)” as an argument to the constructor.
c) Method toString() that will return a string representing the generalized list.
d) Method sum() that will return the sum of all the elements in the list
e) Method max() that will return the largest value in the list
f) Method find(x) that will search for x in the list; and return true if x is present in the list and false otherwise.

 */
package Assignment1;

import java.util.Scanner;

/**
 * @author Anjita
 *
 */
public class ListDemo {
	List list;
	static Scanner sc = new Scanner(System.in);
	static ListDemo listDemo = new ListDemo();
	public static void main(String[] args) {
		System.out.println("Enter list/nFor example : ((251,3),5,((13,2),1,(1,1),(10,(0),7)))");
		String string = null;
		string = sc.next();
		List list = new List(string);
		System.out.println(list.list);
		list.insert(null);
		int choice = 0;
		do {
			listDemo.menu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("sum of elements is ->"
						+ list.sumOfelements(list.start, 0));
				break;
			case 2:
				System.out.println("Max elements is ->"
						+ list.max(list.start, -1275867));
				break;
			case 3:
				System.out.println("Enter searching element");
				int no = sc.nextInt();
				boolean no1=list.find(no);
				System.out.println("Search Result :-");
				if(no1)
					System.out.print("Element is present in list");
				else
					System.out.print("Element is not present in list");
				break;
			case 4:
				list.display(list.start);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("enter correct choice");
			}
		} while (choice != 5);
	}
	
	/**
	 * displays menu
	 */
	public void menu() {
		System.out.println("Enter" + "\n1 for sum"
				+ "\n2 for Max elements"
				+ "\n3 for Search"
				+ "\n4 for Display"
				+ "\n5 for exit" + "\nenter your choice");
	}
}
