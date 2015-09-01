package Assignments;

/**
 * Write a program which create a concordance of characters occurring in a string 
(i.e which characters occur where in a string). 
Read the string from the command line.
Example:  java Concordance Hello World
{d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anjita 
 * class concordance which create a concordance of characters occurring in a string.
 */
public class Concordance {
	public static void main(String[] args) {
		String str1[] = { "hello", "world" };
		String str = "";
		for (int i = 0; i < str1.length; i++) {
			str += str1[i];// String array to string conversion
		}
		char data[] = str.toCharArray();// string to character array conversion
		Set<Character> setChar = new HashSet<Character>();
		for (int i = 0; i < data.length; i++) {
			setChar.add(data[i]);// Character array to set conversion
		}
		Object[] charArray = setChar.toArray();// set to Object array conversion
		for (int i = 0; i < setChar.size(); i++) {
			System.out.print(setChar.toArray()[i] + " = ");
			Collection<Integer> t = new ArrayList<Integer>();
			char c = (Character) charArray[i];
			for (int j = 0; j < data.length; j++) {
				if (c == data[j]) {
					t.add(j);
				}
			}
			System.out.print(t + "\n");
		}
	}
}
