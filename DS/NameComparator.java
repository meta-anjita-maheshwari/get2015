/**
 * DS Session6: question no 1
 */
package Assignments;

import java.util.Comparator;

/**
 * @author Anjita class implementing comparator :- compare by name of employee
 */
public class NameComparator implements Comparator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object object1, Object object2) {
		Employee employee1 = (Employee) object1;
		Employee employee2 = (Employee) object2;

		return employee1.getName().compareTo(employee2.getName());

	}

}
