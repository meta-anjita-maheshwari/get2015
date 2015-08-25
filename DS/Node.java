package Assignments;

/**
 * @author Anjita this class shows basic function of linked list
 * @param <T>
 */
public class Node<T> {
	// data held by the node
	T nodeValue;
	// next node in the list
	Node<T> start;
	Node<T> next;

	/**
	 * default constructor with no initial value
	 */
	public Node() {
		nodeValue = null;
		next = null;
	}

	/**
	 * @param item
	 *            initialize nodeValue to item and set next to null
	 */
	public Node(T item) {
		nodeValue = item;
		next = null;
	}

	/**
	 * @param element
	 * @return boolean value true if element is added
	 */
	boolean add(T element) {

		Node<T> newNode = new Node<T>(element);
		Node<T> current = new Node<T>();
		if (start == null) {
			start = newNode;
			return true;
		} else {
			current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		return true;
	}

	/**
	 * To display elements of linked list
	 * 
	 * @return boolean value true if successful
	 */
	boolean display() {
		Node<T> current = new Node<T>();
		current = start;
		while (current != null) {
			System.out.print(current.nodeValue + " ");
			current = current.next;
		}
		return true;
	}

	@Override
	public String toString() {

		return "Node [nodeValue=" + nodeValue + "]";
	}

	/**
	 * add value at specific position
	 * 
	 * @param position
	 * @param value
	 * @return
	 */
	boolean addAtPostion(int position, T value) {
		Node<T> current = new Node<T>();
		Node<T> newNode = new Node<T>(value);
		current = start;
		int count = 1;
		while (current != null) {
			if (count == position - 1) {
				newNode.next = current.next;
				current.next = newNode;

			}
			count++;
			current = current.next;
		}
		if (count < position) {
			return false;
		}
		return true;

	}

	/**
	 * @param value
	 *            to be deleted
	 * @return
	 */
	boolean deleteByValue(T value) {
		int flag = 0;
		Node<T> current = start;
		if (current == null)
			return false;
		while (current != null) {
			if (current.nodeValue == value) {
				start = current.next;
				return true;
			}
			if (current.next.nodeValue == value) {
				current.next = current.next.next;
				flag = 1;
				return true;
			}
			current = current.next;
		}
		if ((flag == 0) && (current == null)) {
			return false;
		}

		return false;

	}

	/**
	 * @param position
	 *            from where node is to be deleted
	 * @return boolean value false on no deletion
	 */
	boolean deleteByIndex(int position) {
		Node<T> current = new Node<T>();
		current = start;
		if (position == 0) {
			start = current.next;
		}
		int count = 0;
		while (current != null) {
			if (count == position - 1) {
				current.next = current.next.next;

			}
			count++;
			current = current.next;
		}
		if (count < position) {
			return false;
		}
		return false;

	}

	/**
	 * @param position
	 *            :- get items at this position
	 * @return T
	 */
	T getitem(int position) {
		Node<T> current = new Node<T>();
		current = start;
		int count = 1;
		while (current != null) {
			if (count == position) {
				return current.nodeValue;

			}
			count++;
			current = current.next;
		}
		return null;
	}
}
