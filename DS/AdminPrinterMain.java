
import java.util.Scanner;

/**
 * @author Anjita
 * Main class to attempt all actions regarding printer
 * 
 */
public class AdminPrinterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue queue = new PriorityQueue(15);

		char ch;
		/* Perform Priority Queue operations */
		do {
			System.out.println("\nPriority Queue Operations\n");
			System.out.println("Enter 1 for giving information for printing b");
			System.out.println("Enter 2 for performing printing function");
			System.out.println("Enter 3 for exit");
			System.out.println("Enter your choice ");
			int choice;
			do {// Validation

				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				choice = sc.nextInt();
			} while (choice <= 0);
			switch (choice) {
			case 1:

				System.out.println("Choose your post");
				System.out.println("4. ChairPerson");
				System.out.println("3. Professors");
				System.out.println("2. Graduates");
				System.out.println("1. Under Graduates");

				System.out.println("Enter choice");
				int priority;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("It is not a number!Please enter again");
						sc.next();
					}

					priority = sc.nextInt();
					if (priority > 4 || priority < 0) {
						System.out
								.println("It is not available!Please enter again");
					}
				} while ((priority > 4) || (priority < 0));
				System.out.println("Enter job to print");

				queue.insert(sc.next(), priority);
				break;
			case 2:
				System.out.println("\nJob Processing::::\n\n");
				queue.remove();
				break;

			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			System.out
					.println("\nDo you want to continue (Type y to continue) \n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		sc.close();
	}

}
