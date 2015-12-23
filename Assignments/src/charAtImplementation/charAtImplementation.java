package charAtImplementation;

import java.util.Scanner;

/**
 * @author Anjita
 * CharAt function implementation. exception will be thrown if index is out of bound.
 */
public class charAtImplementation {
	
	static String str = "This is sample string";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter index of string character you want to retrieve.");
		int index = scanner.nextInt();
		char output = '\0';
		try {
			output = charAt(index);
			System.out.println("Character at index "+index+" is "+output);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("index entered is out of bound "+e);
		}
		scanner.close();
	}

	/**
	 * charAt function returning character at particular index.
	 * @param index : index of string's particular character
	 * @return : character at index
	 */
	public static char charAt(int index) {
		char arrayString[] = str.toCharArray();
		if(index < 0 || index > arrayString.length){
			throw new StringIndexOutOfBoundsException();
		}
		return arrayString[index] ;
	}

}
