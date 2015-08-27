package Assignments;

/**
 * @author Anjita class performing different function on array lists
 */
public class ArrayList {
	int size = 0;
	int capacity;
	Object[] element;

	/**
	 * default constructor sets capacity of 10
	 */
	public ArrayList() {
		this(10);
	}

	/**
	 * @param capacity
	 *            shows capacity of array list
	 */
	public ArrayList(int capacity) {
		this.capacity = capacity;
		element = new Object[capacity];
	}

	/**
	 * @return the element
	 */
	public Object[] getElement() {
		return element;
	}

	/**
	 * @param element
	 *            the element to set
	 */
	public void setElement(Object[] element) {
		this.element = element;
	}

	/**
	 * @param item
	 *            added at last position of list
	 */
	public void add(Object item) {
		if (capacity <= size) {
			capacity = capacity + 5;
			Object old[] = element;
			element = new Object[capacity];
			for (int i = 0; i < size; i++) {
				element[i] = old[i];
			}
			element[size++] = item;
		} else {
			element[size++] = item;
		}
	}

	/**
	 * displays the list
	 */
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(element[i]);
		}
	}

	/**
	 * @return parameter size
	 */
	public int size() {
		return size;
	}

	/**
	 * @param item
	 *            :- added to list
	 * @param index
	 *            :- at which item is added
	 */
	public void add(Object item, int index) {
		if (capacity <= size) {
			capacity = capacity + 5;
			Object old[] = element;
			element = new Object[capacity];
			for (int i = 0; i <= size; i++) {
				element[i] = old[i];
			}
			for (int i = size; i > index; i--) {
				element[i] = element[i - 1];
			}
			element[index] = item;
			size++;
		} else {
			for (int i = size; i > index; i--) {
				element[i] = element[i - 1];
			}
			element[index] = item;
			size++;
		}
	}

	/**
	 * @param item
	 *            :- whose location is to be find
	 * @return index of the item in list
	 * @return -1 if item is not found
	 */
	public int location(Object item) {
		int temp = -1;
		for (int i = 0; i < size; i++) {
			if (element[i] == item) {
				temp = i;
				break;
			}
		}
		return temp;
	}

	/**
	 * @param index
	 *            :- from where item is removed
	 */
	public void removeIndex(int index) {
		for (int i = index; i < size; i++) {
			element[i] = element[i + 1];
		}
		size--;
	}

	/**
	 * @param item
	 *            :- which is removed from the list, if present
	 */
	public void removeItem(Object item) {
		int temp = -1;
		for (int i = 0; i < size; i++) {
			if (element[i] == item) {
				temp = i;
				break;
			}
		}
		if (temp != -1) {
			removeIndex(temp);
			size--;
		}
	}

	/**
	 * reverses the list
	 */
	public void reverse() {
		Object temp;
		for (int i = 0; i <= size / 2; i++) {
			temp = element[i];
			element[i] = element[size - i - 1];
			element[size - i - 1] = temp;
		}
	}

	/**
	 * clears all element of list
	 */
	public void clearList() {
		for (int i = 0; i < size; i++) {
			element[i] = null;
		}
		size = 0;
	}

	/**
	 * @param list1
	 * @param list2
	 * @return addition of two lists
	 */
	public Object[] addList(ArrayList list1, ArrayList list2) {
		int newSize = list1.size() + list2.size();
		Object newElement[] = element;
		element = new Object[newSize];
		for (int i = 0, k = 0; i < newSize; i++) {
			if (i < list1.size()) {
				list1.element[i] = newElement[i];
			} else {
				list1.element[i] = list2.element[k++];
			}
		}
		size = newSize;
		return list1.element;
	}
}
