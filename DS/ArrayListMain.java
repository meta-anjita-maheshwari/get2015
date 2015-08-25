package Assignments;

/**
 * @author Anjita class demonstrating different functions on array list
 */
public class ArrayListMain {

	public static void main(String[] args) {
		ArrayList object = new ArrayList(5);
		// insertion is first list
		System.out.println("insertion is first list :-");
		object.add(1);
		object.add(3);
		object.add(6);
		object.add(2);
		object.add(19);
		object.add("anji");
		object.add(15);
		object.add(12, 2);
		object.add("anjita");
		object.add(17);
		object.add(18);
		object.add(13);
		object.display();
		System.out.println("");

		// Searching of element 9 which is not present in list1
		System.out
				.println("Searching of element 9 which is not present in list1");
		int location = object.location(9);
		if (location == -1)
			System.out.println("item is not present in list");
		else
			System.out.println("item is at position " + (location + 1));
		System.out.println("");

		// Searching of element 6 which is present in list1 at index 3
		System.out
				.println("Searching of element 6 which is present in list1 at index 3");
		location = object.location(6);
		if (location == -1)
			System.out.println("item is not present in list");
		else
			System.out.println("item is at position " + (location + 1));
		System.out.println("");

		// removal of item from index 4
		System.out.println("removal of item from index 4");
		object.removeIndex(4);
		object.display();
		System.out.println("");

		// removal of item 1 from list
		System.out.println("removal of item 1 from list");
		object.removeItem(1);
		object.display();
		System.out.println("");

		// reverse of list1
		System.out.println("reverse of list1");
		object.reverse();
		object.display();
		System.out.println("");

		// empty list1
		System.out.println("empty list1 is");
		object.clearList();
		object.display();
		System.out.println("");

		// add element in list1 and list2
		ArrayList object1 = new ArrayList(5);
		object1.add("list2-1");
		object1.add("list2-2");
		object1.add("list2-3");
		object1.add("list2-4");
		object1.add("list2-5");

		object.add("list1-1");
		object.add("list1-2");
		object.add("list1-3");
		object.add("list1-4");
		object.add("list1-5");
		object.add("list1-6");

		System.out.println("element of list1 are");
		object.display();
		System.out.println("");

		System.out.println("element of list2 are");
		object1.display();
		object.addList(object, object1);
		System.out.println("");

		// addition of two lists
		System.out.println("list after addition is");
		object.display();
	}

}
