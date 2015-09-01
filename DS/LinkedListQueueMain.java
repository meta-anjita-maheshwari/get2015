package Assignments;

/**
 * Write a program to implement the Queue functionality using the java collections.
 * Look for the best collection to meet this requirement. 
 * Provide some points justifying your collection choice. 
 */
import java.util.Scanner;

/**
 * @author Anjita
 *
 */
public class LinkedListQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListQueue queue = new LinkedListQueue();
		int choice = 0;
		String data;
		do {
			// menu
			System.out.println("Enter 1 for Inserting element in Queue,"
					+ "\n2 for removing from queue"
					+ "\n3 for getting element at first position"
					+ "\n4 for displaying all elements from queue"
					+ "\n5 for clearing queue"
					+ "\n6 for getting size  of queue" + "\n7 for exit"
					+ "\nEnter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter data to insert in queue");
				data = sc.next();
				queue.enqueue(data);
				System.out.println("Element inserted in queue");
				break;
			case 2:
				data = queue.dequeue();
				System.out.println("Element removed from queue is :" + data);

				break;
			case 3:
				data = queue.getFront();
				System.out.println("Element at front of queue is :" + data);
				break;
			case 4:
				queue.display();
				break;
			case 5:
				queue.makeEmpty();
				System.out.println("queue is now empty");
				break;
			case 6:
				System.out.println("Size of queue is: " + queue.getSize());
				break;
			default:
				System.out.println("enter right values");
			}
		} while (choice != 7);
		sc.close();
	}
}
