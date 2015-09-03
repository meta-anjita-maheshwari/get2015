/**
 * DS Session6: question no 2
 */
package Assignments;

import java.util.Scanner;
import java.util.Set;

/**
 * @author Anjita
 *
 */
public class UniqueCharacterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UniqueCharacter character = new UniqueCharacter();
		Scanner sc = new Scanner(System.in);
		String string = "";
		do {
			System.out.println("enter string"
					+ "\nenter 'stop' for stop the process");
			string = sc.nextLine();
			Set<Character> uChar = character.getUnique(string);
			System.out.println("unique characters are");
			System.out.println(uChar);
			System.out.println("number of unique characters :-" + uChar.size());
		} while (!(string.equalsIgnoreCase("stop")));
		sc.close();
	}

}
