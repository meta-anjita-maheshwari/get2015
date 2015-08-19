package Assignment3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * @author Anjita
 * this class shows the function of train reservation system
 */
public class TrainManagement {
	static Scanner sc = new Scanner(System.in);

	List<Train> pTrainList;
	List<Train> gTrainList;
	List<Train> trainList;
	Iterator<Train> itr = trainList.iterator();
	Iterator<Train> pItr = pTrainList.iterator();
	Iterator<Train> gItr = gTrainList.iterator();
	String from_to;

	public static void main(String[] args) {
		TrainManagement trainM = new TrainManagement();
		// Write in train file
		try {
			trainM
					.writeData("C://anjita//Session4//src//Assignments//Train.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		trainM.readData("C://anjita//Session4//src//Assignments//Train.csv");

		System.out.println("1 : for ticket booking");
		System.out.println("2 : for train status");
		System.out.println("3 : for Exit");
		System.out.println("Enter your choice");
		int choice1 = sc.nextInt();
		do {
			switch (choice1) {
			case 1:
				System.out
						.println("Enter your name and type of train\nGoods - G\nPassenger - P");
				String name = sc.next();
				String type = sc.next();
				String ticketID;

				if (type == "P")
					trainM.printPTrain();
				else
					trainM.printGTrain();

				System.out.println("Enter train ID and number of seats/weight");
				int id = sc.nextInt();
				int seat_weight = sc.nextInt();
				int amount = trainM.allocate(type, id, seat_weight);

				if (amount == 0)
					System.out
							.println("Booking is not possible, not enough seats/weight available");
				else {
					System.out.println("Enter payment method");
					System.out.println("1 for Credit Card");
					System.out.println("2 for Wallet");
					System.out.println("3 for Net Banking");
					System.out.println("Enter your choice");
					int choice = sc.nextInt();
					Payment pay = new Payment();
					switch (choice) {
					case 1:
						System.out.println("Enter credit card number and CCV");
						int ccNo = sc.nextInt();
						int ccv = sc.nextInt();
						pay.creditCard(ccNo, ccv);
						break;
					case 2:
						pay.wallet();
					case 3:
						System.out
								.println("Enter bank name, user name and password");
						String bName = sc.next();
						String userName = sc.next();
						String password = sc.next();
						pay.netBanking(bName, userName, password);
					default:
						System.out.println("Enter correct choice");
					}
					System.out.println("your ticket is confrmed");
					System.out.println("Ticket detail:-");
					ticketID = type + "_" + trainM.from_to;

					System.out.println(name + "\t" + ticketID + "\t"
							+ seat_weight + "\t" + amount);
					break;
				}

			case 2:
				trainM.printTrain();
				break;

			case 3:
				break;
			default:
				System.out.println("Enter correct choice");
			}
		} while (choice1 != 3);
	}

	/**
	 * @param fileName :- name of file where we will write data
	 * @throws IOException
	 */
	public void writeData(String fileName) throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter(fileName));

		System.out.println("Enter no. of trains");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter train no" + (i + 1) + "'s information");
			String[] data = sc.next().split(",");
			writer.writeNext(data);
		}
		writer.close();
	}

	/**
	 * @param fileName :- name of file from where we will read data
	 * read value is stored in Passenger train list, goods train list and train list according to the condition
	 */
	public void readData(String fileName) {
		CSVReader csvReader = null;
		try {
			csvReader = new CSVReader(new FileReader(fileName));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String type;
		int trainId;
		int seats;
		int weight;
		String fromTo;
		int charge;
		String[] row = null;
		try {
			while ((row = csvReader.readNext()) != null) {
				type = row[0];
				trainId = Integer.parseInt(row[1]);
				seats = Integer.parseInt(row[2]);
				weight = Integer.parseInt(row[3]);
				fromTo = row[4];
				from_to = fromTo;
				charge = Integer.parseInt(row[5]);
				Train trainInfo = new Train(type, trainId, seats, weight,
						fromTo, charge);
				trainList.add(trainInfo);
				if (type == "G")
					pTrainList.add(trainInfo);
				else
					gTrainList.add(trainInfo);
			}
		} catch (IOException e) {

		}
	}
/**
 * prints information of both passenger and goods train
 */
	public void printTrain() {
		System.out.println("Type\tTrain ID\tSeats\tWeight\tFrom-To\tCharge");
		itr = trainList.iterator();
		while (pItr.hasNext()) {
			System.out.println(pItr.next());
		}
	}
/**
 * prints information of passenger train
 */
	public void printPTrain() {
		System.out.println("Type\tTrain ID\tSeats\tWeight\tFrom-To\tCharge");
		pItr = pTrainList.iterator();
		while (pItr.hasNext()) {
			System.out.println(pItr.next());
		}
	}
/**
 * prints information of goods train
 */
	public void printGTrain() {
		System.out.println("Type\tTrain ID\tSeats\tWeight\tFrom-To\tCharge");
		gItr = gTrainList.iterator();
		while (gItr.hasNext()) {
			System.out.println(gItr.next());
		}
	}
/**
 * @param type :- type of train
 * @param trainId :- train ID
 * @param seat_weight :- Seats/Weight for booking
 * @return amount of booking
 */
	public int allocate(String type, int trainId, int seat_weight) {
		int charges = 0;
		if (type == "P" || type == "p") {
			pItr = pTrainList.iterator();
			Train objectP = pItr.next();
			if (objectP.getType().equalsIgnoreCase(type)
					&& objectP.getTrainId() == trainId
					&& seat_weight < objectP.getSeats()) {
				objectP.seats -= seat_weight;
				charges = seat_weight * objectP.charge;
			}
		} else {
			gItr = gTrainList.iterator();
			Train objectG = gItr.next();
			if (objectG.getType().equalsIgnoreCase(type)
					&& objectG.getTrainId() == trainId
					&& seat_weight < objectG.getWeight()) {
				objectG.weight -= seat_weight;
				charges = seat_weight * objectG.charge;
			}
		}
		return charges;
	}
}
