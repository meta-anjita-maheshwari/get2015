/**
 * DS Session6: question no 2
 */
package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Anjita
 *
 */
public class UniqueCharacter {

	Map<String, SortedSet<Character>> mapping = new HashMap<String, SortedSet<Character>>();

	/**
	 * @param input
	 *            :- input string
	 * @return :- set of unique characters
	 */
	public Set<Character> unique(String input) {
		Set<Character> setChar = new TreeSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				continue;
			}
			setChar.add(ch);
		}
		mapping.put(input, (SortedSet<Character>) setChar);
		return setChar;
	}

	/**
	 * firstly checks map for information of unique characters
	 * 
	 * @param input
	 *            :- input string
	 * @return :- set of unique characters
	 */
	public Set<Character> getUnique(String input) {
		if (mapping.containsKey(input)) {
			System.out.println("this result is from mapping");
			return mapping.get(input);
		} else {
			System.out.println("this result is newly calculated");
			return this.unique(input);
		}
	}
}
