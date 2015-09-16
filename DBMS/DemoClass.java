/**
 * JDBC Assignment1,2,3
 */
package com.metacube.jdbc.example;

import java.util.List;
import java.util.Scanner;

/**
 * @author Anjita Fetch all the books published by author, given the name of the
 *         author. Return the books data (List of Titles)
 */
public class DemoClass {
	public static void main(String[] args) {
		try{
		DemoClass demoClass = new DemoClass();
		Scanner sc = new Scanner(System.in);
		String choice = "";
		while (!choice.equalsIgnoreCase("4")) {
			demoClass.menu();
			choice = sc.next();

			switch (choice) {
			case "1":
				demoClass.bookAuthor();
				break;

			case "2":
				demoClass.bookMember();
				break;

			case "3":
				demoClass.bookDelete();
				break;

			case "4":
				System.exit(0);
				
			default:
				System.out.println("Enter correct choice");
			}
		}
		sc.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("\nExiting . . .");
	}

	/**
	 * Displays menu
	 */
	public void menu() {
		System.out
				.println("Enter 1 for Fetch all the books published by author");
		System.out.println("Enter 2 for issue book to existing member");
		System.out
				.println("Enter 3 for Delete all those books which were not issued in last 1 year");
		System.out.println("Enter 4 for exit");
		System.out.println("Enter your choice");
	}

	/**
	 * Fetch all the books published by author
	 */
	public void bookAuthor() {
		BooksOfAuthor booksOfAuthor = new BooksOfAuthor();
		List<Titles> listTitle = booksOfAuthor
				.executeQueryUsingPreparedStatement();
		if (listTitle.isEmpty()) {
			System.out.println("no such author exist");
		} else {
			for (Titles t : listTitle) {
				System.out.println(t);
			}
		}
	}

	/**
	 * issue book to existing member
	 */
	public void bookMember() {
		BookOfMember bookOfMember = new BookOfMember();
		int flag = bookOfMember.executeQueryUsingPreparedStatement();
		if (flag == 1) {
			System.out.println("book is issued");
		} else {
			System.out.println("book is not issued");
		}
	}

	/**
	 * Delete all those books which were not issued in last 1 year
	 */
	public void bookDelete() {
		DeleteBook deleteBook = new DeleteBook();
		int flag1 = deleteBook.deleteBooks();
		if (flag1 == 1) {
			System.out.println("record is deleted");
		} else {
			System.out.println("no record deleted");
		}
	}
}
