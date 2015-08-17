package Assignments;

/**
 * @author Anjita
 * Person class
 * variables 
 * uid :- uid of person
 * name :- name of person
 */
public class Person {
	private int uid;
	private String name;

	/**
	 * @param uid2
	 * @param name2
	 * constructor sets both values
	 */
	public Person(int uid2, String name2) {
		this.uid = uid2;
		this.name = name2;
	}

	/**
	 * @returns uid of person
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @param set uid of person
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * @return name of person
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param set name of person
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * returns uid and name of person
	 */
	public String toString() {
		return "Name :-" + name + "\nuid :-" + uid;
	}

}
