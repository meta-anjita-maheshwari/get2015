package Assignments;

import java.util.Scanner;

/**
 * @author Anjita
 * Demonstrate student class and inherited person class.
 * variables
 * course1 :- String array holds subjects.
 * name1 :- name of person.
 * uid1 :- uid of person.
 * Studentid1 :- Student id of student
 */
public class DemoPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] course1 = { "" };												
		Student stud = new Student(0, "not set", 0, course1);					//object with default values

		System.out.println("Enter name of student");
		String name1 = sc.next();
		stud.setName(name1);													

		System.out.println("Enter UID of student");
		int uid1 = sc.nextInt();
		stud.setUid(uid1);

		System.out.println("Enter Student ID of student");
		int studentid1 = sc.nextInt();
		stud.setUid(studentid1);

		System.out.println("Enter number of Subjects");
		int noOfSub = sc.nextInt();
		course1 = new String[noOfSub];

		System.out.println("Enter subjects");
		for (int i = 0; i < noOfSub; i++)
			course1[i] = sc.next();
		stud.setCourses(course1);

		String show = "";
		show = stud.toString();
		System.out.println(show);
		String[] prints = stud.getCourses();
		System.out.println("Courses :-");
		for (int i = 0; i < prints.length; i++)
			System.out.println(prints[i]);
		sc.close();
	}

}
