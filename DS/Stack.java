package Assignments;

/**
 * @author Anjita Stack class showing function of stack, i.e push, pop, display.
 * @param <T>
 */
public class Stack<T> {

	public T nodeValue;
	private Stack<T> next;
	// private Stack<T> newNode=new Stack<T>();
	public Stack<T> top;

	/**
	 * default constructor
	 */
	public Stack() {
		nodeValue = null;
		next = null;
		top = null;
	}

	/**
	 * constructor wita data as argument
	 * @param data :- will be set to node value
	 */
	Stack(T data) {
		nodeValue = data;
		next = null;
	}

	/**
	 * @param data :- which is to be pushed
	 * @return top pointer pointing to new node of data
	 */
	public Stack<T> push(T data) {
		Stack<T> newNode = new Stack<T>(data);
		newNode.next = top;
		top = newNode;
		return top;
	}

	/**
	 * @return top pointer pointing to next node after deletion of top node
	 */
	public Stack<T> pop() {
		if (top != null) {
			System.out.println(top.nodeValue + " will be deleted");
			top = top.next;
		} else {
			System.out.println("Stack is already empty");
		}

		return top;

	}

	/**
	 * displays stack
	 */
	public void display() {
		Stack<T> ptr = new Stack<T>();
		ptr = top;
		if (ptr == null) {
			System.out.println("Stack is empty");
		} else {
			while (ptr != null) {
				System.out.println(ptr.nodeValue);
				ptr = ptr.next;
			}
		}
	}
}
