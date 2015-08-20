package Assignments;

/**
 * @author Anjita
 * class that calls display items
 */
public class MainMenu {
	public MainMenu() {
		Menu menu = new Menu();
		ActionableMenuItem item1 = new ActionableMenuItem("1 : for ticket booking");
		ActionableMenuItem item2 = new ActionableMenuItem("2 : for train status");		
		ActionableMenuItem item3 = new ActionableMenuItem("3 : for Exit");	
		menu.addMenuItem(item1);
		menu.addMenuItem(item2);
		menu.addMenuItem(item3);
		menu.display();
	}
	

}
