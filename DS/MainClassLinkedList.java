package Assignments;

/**
 * @author Anjita class demonstrating function of linked list
 */
public class MainClassLinkedList {
	public static void main(String args[]) {
		Node<Integer> a = new Node<Integer>();
		a.add(5);
		a.add(96);
		a.add(1);
		a.add(87);
		a.add(-1);
		System.out.println("\nList elements are :-");
		a.display();

		System.out.println("\nAdding at position");
		a.addAtPostion(2, 100);
		a.display();

		System.out.println("\n\nDeleting item by value");
		if (a.deleteByValue(96)) {

		} else {
			System.out.println("no such type of number Exist");
		}
		a.display();

		a.deleteByIndex(1);
		System.out.println("\n\nDeleting item at index 1");
		a.display();

		System.out.println("\ngetting item");
		System.out.println(a.getitem(3));
		
		a.sortList();
		System.out.println("\n\nSorted list is");
		a.display();
		
		a.reverseLinkedList();
		System.out.println("\n\nReverse linked list is");
		a.display();
	}
}
