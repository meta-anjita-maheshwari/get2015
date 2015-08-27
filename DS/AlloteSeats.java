package Assignments;

/**
 * @author Anjita
 * this class :-
 * 1. demonstrates the functioning of queue
 * 2. allocate the seats of colleges to the students according their rank 
 */

import java.util.Scanner;

import Assignments1.ArrayList;
import Assignments1.Queue;

public class AlloteSeats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of element to be entered in queue");
		int no = sc.nextInt();
		Queue queue = new Queue(no);
		int choice1;
		do {
			System.out.println("enter 1 for enqueue");
			System.out.println("enter 2 for dequeue");
			System.out.println("enter 3 for exit");
			System.out.println("enter your choice");
			choice1 = sc.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("enter number to be enqueue");
				int data = sc.nextInt();
				try {
					queue.enQueue(data);
				} catch (Exception e) {
					System.out.println("overflow");
				}
				System.out.println(data + " is enqueued");
				break;
			case 2:
				try {
					Object element = queue.deQueue();
					System.out.println(element + " is dequeued");
				} catch (Exception e) {
					System.out.println("underflow");
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Enter correct choice");
			}
		} while (choice1 != 3);

		System.out.println("Counseling process");
		System.out.println("Enter the number of students");
		int nstudent = sc.nextInt();

		Queue studentQueue = new Queue(nstudent);
		int scount = 0, ccount = 0;

		while (nstudent != scount) {
			sc = new Scanner(System.in);
			System.out.println("Enter college choice for rank " + (scount + 1)
					+ " student");
			studentQueue.enQueue(sc.next());
			scount++;
		}

		// college name and there seats store in list
		ArrayList college = new ArrayList();
		System.out
				.println("Enter number of colleges available in counseling process");
		int ncollege = sc.nextInt();
		int cseats, nseats;
		String cname;
		while (ncollege != ccount) {
			System.out.println("Enter name of college " + (ccount + 1));
			cname = sc.next();
			System.out.println("Enter number of seats in college ");
			nseats = sc.nextInt();
			cseats = 0;
			while (cseats != nseats) {
				college.add(cname);
				cseats++;
			}
			ccount++;
		}
		// Show result of counseling
		int i = 1;
		Object choice, allocateCollege;
		System.out.println("\t\t\t\t\t**Councelling result**\t\t\t\t\t");
		while (college.size() != 0) {
			try {
				choice = studentQueue.deQueue();
			} catch (Exception e) {
				break;
			}
			try {
				allocateCollege = college.remove(choice);
			} catch (Exception e) {
				allocateCollege = null;
			}
			if (allocateCollege != null) {
				System.out.println(i + " Rank student get " + allocateCollege
						+ " college");
			}
			i++;
		}

		System.out.println("Remaining students may try for next counseling");
		sc.close();
	}

}
