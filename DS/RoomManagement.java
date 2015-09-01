package Assignments;

import java.util.Scanner;

/**
 * @author Anjita
 *
 */
public class RoomManagement {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		char mainChoice = 0;
		int numberOfRooms;

		RoomManagement management = new RoomManagement();

		
		do {// Validation
			System.out.println("Enter prime Number of Rooms");
			while (!management.sc.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				management.sc.next(); // this is important!
			}
			numberOfRooms = management.sc.nextInt();
			if (numberOfRooms % 2 == 0) {
				numberOfRooms = -1;
			}
		} while (numberOfRooms <= 0);
		RoomAllocation allocation = new RoomAllocation(numberOfRooms);

		do {

			int roomNumber = 0;
			// menu
			System.out.println("Enter 1 for Allocating Room,"
					+ "\n2 for Getting information of room"
					+ "\n3 for unbooking room"
					+ "\n4 for dispalying room status");
			choice = management.checkingInteger(choice);
			switch (choice) {
			case 1:
				System.out.println("Enter Name of Guest");
				String name = management.sc.next();
				System.out.println("Enter Age of Guest");
				int age = management.sc.nextInt();
				Guest guest = new Guest(age, name);
				allocation.allocateRoom(guest);
				break;
			case 2:
				System.out.println("Enter Room Number");
				roomNumber = management.checkingInteger(roomNumber);
				allocation.getRoomInformation(roomNumber);

				break;
			case 3:
				System.out.println("Enter Room Number");
				roomNumber = management.checkingInteger(roomNumber);
				allocation.freeBookedRoom(roomNumber);
				break;
			case 4:
				allocation.displayAllGuest();
				break;
			default:
				System.out.println("enter rightvalues");

			}
			mainChoice = management.checkingString(mainChoice);
		} while (mainChoice == 'Y');
		management.sc.close();
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

			while (!sc.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				sc.next(); // this is important!
			}
			value = sc.nextInt();
		} while (value <= 0);
		return value;
	}

	/**
	 * checking input is String or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :return a char value
	 */
	public char checkingString(char value) {

		do {// validation
			System.out.println("Do you want to continue ?(Y/N)"); // continuing
			// the
			// procedure
			while (!sc.hasNext()) {
				System.out.println("That's not a character!");
				sc.next(); // this is important!

			}
			value = sc.next().toUpperCase().charAt(0);
			if (value == 'N')
				break;
		} while (value != 'Y');
		return value;
	}
}
