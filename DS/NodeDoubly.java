package Assignments;

/**
 * @author Anjita this class shows basic function of linked list
 * @param <T>
 */
public class NodeDoubly<T> {
	// data held by the node
	T nodeValue;
	// next node in the list
	NodeDoubly<T> start;
	NodeDoubly<T> next;
	NodeDoubly<T> pre;

	/**
	 * default constructor with no initial value
	 */
	public NodeDoubly() {
		nodeValue = null;
		next = null;
		pre = null;
	}

	/**
	 * @param item
	 *            initialize nodeValue to item and set next and previous to null
	 */
	public NodeDoubly(T item) {
		nodeValue = item;
		next = null;
		pre = null;
	}

	/**
	 * @param element
	 * @return boolean value true if element is added
	 */
	boolean add(T element) {

		NodeDoubly<T> newNode1 = new NodeDoubly<T>(element);
		NodeDoubly<T> current = new NodeDoubly<T>();
		if (start == null) {
			start = newNode1;
			newNode1.pre = start;
			return true;
		} else {
			current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode1;
			newNode1.pre = current;
		}
		return true;
	}

	/**
	 * To display elements of linked list
	 * 
	 * @return boolean value true if successful
	 */
	boolean display() {
		NodeDoubly<T> current = new NodeDoubly<T>();
		current = start;
		System.out.println("Singly Linked List:");
		while (current != null) {
			System.out.print(current.nodeValue + "<-> ");
			current = current.next;
		}
		System.out.println();
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
		NodeDoubly<T> newNode1 = new NodeDoubly<T>(value);
		NodeDoubly<T> current = new NodeDoubly<T>();

		current = start;
		int count = 1;
		if (position == 1) {
			newNode1.next = current;
			newNode1.pre = start;
			start = newNode1;
		}

		else {
			count = 2;
			while (current != null) {
				if (count == position) {
					newNode1.next = current.next;
					newNode1.pre = current;
					current.next = newNode1;
					// break;
				}
				count++;
				current = current.next;
			}
			if (count < position) {
				return false;
			}
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
		NodeDoubly<T> current = start;
		if (current == null)
			return false;
		while (current != null) {
			if (current.nodeValue == value) {

				start = current.next;
				return true;
			}
			if (current.next != null) {
				if (current.next.nodeValue == value) {
					if (current.next.next != null) {
						current.next.next.pre = current;
					}
					current.next = current.next.next;

					flag = 1;
					return true;
				}
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
		NodeDoubly<T> current = new NodeDoubly<T>();
		current = start;
		int count = 1;
		if (position == 1) {
			start = current.next;
			current.next.pre = start;
		} else {
			count = 2;
			while (current != null) {
				if (count == position) {
					current.next = current.next.next;
					current.next.next.pre = current;
				}
				count++;
				current = current.next;
			}
			if (count < position) {
				return false;
			}
		}
		return true;

	}

	/**
	 * @param position
	 *            :- get items at this position
	 * @return T
	 */
	T getitem(int position) {
		NodeDoubly<T> current = new NodeDoubly<T>();
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

	/**
	 * Reverses the doubly linked list
	 */
	public void reverseLinkedList() {
		if (start == null || start.next == null)
			return;
		NodeDoubly<T> Second = start.next;
		Second.pre = start;
		// store third node before we change
		NodeDoubly<T> Third = Second.next;
		Third.pre = Second;
		// Second's next pointer
		Second.next = start; // second now points to head

		start.next = null; // change head pointer to NULL
		// only two nodes, which we already reversed
		if (Third == null)
			return;
		NodeDoubly<T> CurrentNode = Third;
		NodeDoubly<T> PreviousNode = Second;
		while (CurrentNode != null) {
			NodeDoubly<T> NextNode = new NodeDoubly<T>();
			NextNode = CurrentNode.next;
			CurrentNode.next = PreviousNode;
			PreviousNode = CurrentNode;
			CurrentNode = NextNode;
		}
		start = PreviousNode; // reset the head node
		NodeDoubly<T> current = start;

	}

	/**
	 * Sorts element of linked list
	 * 
	 * @return true if sorted successfully
	 */
	public boolean sortList() {
		if (start == null || start.next == null)
			return true;

		NodeDoubly<T> newHead = new NodeDoubly<T>(start.nodeValue);
		NodeDoubly<T> pointer = start.next;
		pointer.pre = start;

		// loop through each element in the list
		while (pointer != null) {
			// insert this element to the new list

			NodeDoubly<T> innerPointer = newHead;
			NodeDoubly<T> next = pointer.next;
			if ((int) pointer.nodeValue <= (int) newHead.nodeValue) {
				NodeDoubly<T> oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
				oldHead.pre = newHead;
			} else {
				while (innerPointer.next != null) {

					if ((int) pointer.nodeValue > (int) innerPointer.nodeValue
							&& (int) pointer.nodeValue <= (int) innerPointer.next.nodeValue) {
						NodeDoubly<T> oldNext = innerPointer.next;

						innerPointer.next = pointer;
						pointer.pre = innerPointer;
						pointer.next = oldNext;
						oldNext.pre = pointer;
					}

					innerPointer = innerPointer.next;
				}

				if (innerPointer.next == null
						&& (int) pointer.nodeValue > (int) innerPointer.nodeValue) {
					innerPointer.next = pointer;
					pointer.pre = innerPointer;
					pointer.next = null;
				}
			}
			pointer = next;
		}
		start = newHead;
		return true;
	}
}
