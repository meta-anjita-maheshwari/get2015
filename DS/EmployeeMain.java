/**
 * DS Session6: question no 1
 */
package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Anjita
 *
 */
public class EmployeeMain {
	Scanner sc = new Scanner(System.in);
	List<Employee> employee1 = new ArrayList<Employee>();

	public static void main(String[] args) {

		EmployeeMain employeeMain = new EmployeeMain();
		int choice = 0;
		do {
			employeeMain.menu();
			choice = employeeMain.sc.nextInt();
			switch (choice) {
			case 1:
				employeeMain.getInformation();
				break;
			case 2:
				employeeMain.naturalSort();
				break;
			case 3:
				employeeMain.sortByName();
				break;
			case 4:
				employeeMain.sortWithoutRepeat();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("enter correct choice");
			}
		} while (choice != 5);

	}

	/**
	 * displays menu
	 */
	public void menu() {
		System.out.println("Enter" + "\n1 for entering employee information"
				+ "\n2 for Sorting in Natural order(Employee ID)"
				+ "\n3 for Sort on the basis of name"
				+ "\n4 for Sort in Natural order - Repeatation not allowed"
				+ "\n5 for exit" + "\nenter your choice");
	}

	/**
	 * gets information of employee
	 */
	public void getInformation() {
		System.out.println("enter employee name");
		String name = sc.next();
		System.out.println("enter employee ID");
		int employeeId = sc.nextInt();
		System.out.println("enter employee address");
		String adderss = sc.next();
		Employee employee = new Employee(employeeId, name, adderss);
		employee1.add(employee);
	}

	/**
	 * Sorting in Natural order
	 */
	public void naturalSort() {
		Collections.sort(employee1);
		System.out.println("Sorting in Natural order(Employee ID)");
		System.out.println(employee1);
	}

	/**
	 * Sort on the basis of name
	 */
	public void sortByName() {
		NameComparator nameComparator = new NameComparator();
		Collections.sort(employee1, nameComparator);
		System.out.println("Sort on the basis of name");
		System.out.println(employee1);
	}

	/**
	 * Sort in Natural order - Repeatation not allowed
	 */
	public void sortWithoutRepeat() {
		Set<Employee> employees2 = new HashSet<Employee>(employee1);
		System.out.println("Sort in Natural order - Repeatation not allowed");
		System.out.println(employees2);
	}
}
