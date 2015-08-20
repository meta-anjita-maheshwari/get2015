package Assignments;


/**
 * @author Anjita
 *  Class for displaying the menu function
 */
public class ActionableMenuItem implements MenuItem{
	
	String displayText; 
	public ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}

	@Override
	public void display() {
		System.out.println(displayText);
		
	}

	public void takeAction(int choice) {
		TrainManagement trainM = new TrainManagement();
		switch (choice) {
		case 1:
			trainM.booking(trainM);
			break;
		case 2:
			trainM.printTrain();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Enter correct choice");
		}
		
	}

}

