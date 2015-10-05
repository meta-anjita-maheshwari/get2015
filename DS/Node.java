/**
 * Assignment-1
 */
package Assignment1;

/**
 * @author Anjita 
 * Node Class with three fields : tag, data, and next.
 */
public class Node {
	private Object data;
	private Node next;
	private int tag;

	/**
	 * Default constructor
	 */
	Node() {
		tag = 0;
		data = null;
	}

	/**
	 * Constructor with parameter
	 * @param tag : shows if data is value or link to other list
	 * @param data
	 */
	Node(int tag, Object data) {
		this.data = data;
		next = null;
		this.tag = tag;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the tag
	 */
	public int getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(int tag) {
		this.tag = tag;
	}
}
