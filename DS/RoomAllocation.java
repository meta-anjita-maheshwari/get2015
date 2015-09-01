package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Anjita
 * @param rooms :- list of rooms
 * @param numberOfRooms :- number of rooms
 */
public class RoomAllocation {

	private List<Room> rooms; 
	private int numberOfRooms; 

	/**
	 * @param numberOfRooms :number of rooms
	 */
	public RoomAllocation(int numberOfRooms) {

		this.numberOfRooms = numberOfRooms;
		rooms = new ArrayList<Room>(this.numberOfRooms);
		
		for (int i = 0; i < numberOfRooms; i++) {
			Room room = new Room();
			rooms.add(room);
		}
	}

	/** for generating hash value for an age
	 * @param key :age
	 * @return :hash value
	 */
	public int hashThis(int key) { 

		return key % numberOfRooms;
	}

	/**
	 * @param roomNumber :room number for which information displayed
	 */
	public void getRoomInformation(int roomNumber) {
		if(roomNumber<rooms.size()) {
			
			if (rooms.get(roomNumber).getAvailable() == 1) {
				System.out.println("Name of guest :"
						+ rooms.get(roomNumber).getGuest().getName());
				System.out.println("Age of guest :"
						+ rooms.get(roomNumber).getGuest().getKey());
			} else {
				System.out.println("Room was not booked");
			}
		}
		else{
			System.out.println("No such room Exist");
		}

	}

	/**
	 * @param guest :allocate room to the guest
	 */
	public void allocateRoom(Guest guest) {
		int count = 0;
		int hash = hashThis(guest.getKey());
		
		while (rooms.get(hash).getAvailable() == 1) {
			hash = (hash + 1) % numberOfRooms;
			count++;
		
		}
		if (count == rooms.size()) {
			System.out.println("No rooms available");
			return;
		}
			Room room = new Room(guest);
			rooms.set(hash, room);
		int roomNumber=rooms.indexOf(room);
		System.out.println("Room no allocated to guest is: "+(roomNumber));
	}

	/**
	 * @param roomNumber :to free the room
	 */
	public void freeBookedRoom(int roomNumber) {
		if (rooms.get(roomNumber).getAvailable() == 1) {
			Room room = new Room();
			rooms.set(roomNumber, room);
			System.out.println("Room is unbooked");
		} else {
			System.out.println("Room was not booked previously");
		}
	}

	/**
	 * To display all guest 
	 */
	public void displayAllGuest() {
		int roomNumber = 0;
		Iterator<Room> roomIterator = rooms.iterator();
		while (roomIterator.hasNext()) {
			Room room = roomIterator.next();
			if(room.getAvailable()==1) {
			System.out.println("Room Number is : " + roomNumber);
			System.out.println("Name of guest : " + room.getGuest().getName());
			System.out.println("Age of guest : " + room.getGuest().getKey());
			System.out.println();
			}
			else{
				System.out.println("Room Number : " + roomNumber +"is not booked");	
				
				System.out.println();
			}
			roomNumber = roomNumber + 1;
		}
	}
	

}
