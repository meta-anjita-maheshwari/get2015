/**
 * Implement generalized list collection in Java. An element of a generalized list can itself be a generalized list. Here is an example of a generalized list-

(5, (8, 3), (6, (10, 12), 4), 7)

The above list consists of four elements, the first and last elements are numbers, whereas second and third elements are themselves lists. 

You can assume that the atomic elements of the list are integers.

Implement the following methods for this collection:

a) Constructor to create an empty list.
b) Constructor that will take a string representing a generalized list; and will create the list accordingly. For example we can provide “(5, (8, 3), (6, (10, 12), 4), 7)” as an argument to the constructor.
c) Method toString() that will return a string representing the generalized list.
d) Method sum() that will return the sum of all the elements in the list
e) Method max() that will return the largest value in the list
f) Method find(x) that will search for x in the list; and return true if x is present in the list and false otherwise.

 */
package Assignment1;

/**
 * @author Anjita Class list implement generalized list collection.
 */
public class List {

	Node start;

	String list, str = "";
	int position = 0;

	/**
	 * Constructor to create an empty list.
	 */
	public List() {
		list = null;
	}

	/**
	 * @param string
	 *            :string representing a generalized list
	 */
	public List(String string) {
		list = string;
	}

	/**
	 * Inserts element into list from string 'list'
	 * 
	 * @param node
	 *            : recently inserted node.
	 */
	void insert(Node node) {

		if (position < list.length()) {
			if (node == null) {
				Node temp;
				if (list.charAt(position) == '(') {
					temp = new Node(1, null);
				} else {

					while (list.charAt(position) != ','
							&& list.charAt(position) != '('
							&& list.charAt(position) != ')') {
						str += list.charAt(position);
						position++;
						System.out.println(str);
					}
					temp = new Node(0, Integer.parseInt(str));
					str = "";
				}
				start = temp;
				position++;
				insert(temp);
			} else if (list.charAt(position) == '(') {
				Node temp = new Node(1, null);
				node.setNext(temp);
				position++;
				insert(node.getNext());
				insert(node.getNext());
			} else if (list.charAt(position) == ')') {
				position++;
				return;
			} else if (list.charAt(position) == ',') {
				position++;
				insert(node);
			} else {

				while (list.charAt(position) != ','
						&& list.charAt(position) != '('
						&& list.charAt(position) != ')') {
					str += list.charAt(position);
					position++;
				}
				position--;
				Node temp = new Node(0, Integer.parseInt(str));
				str = "";
				if (node.getTag() == 0) {
					node.setNext(temp);
					System.out.println("node is created  0 tag->"
							+ temp.getData() + "+" + node.getData());
					position++;
					insert(temp);

				} else if (node.getTag() == 1 && node.getData() != null) {
					node.setNext(temp);
					System.out
							.println("node is created  0 tag and store in main list->"
									+ node.getNext().getData());
					position++;
					insert(temp);
				} else {

					node.setData(temp);
					System.out
							.println("node is created 0 tag and store under sublist->"
									+ temp.getData());
					position++;
					insert(temp);
				}

			}

		}
	}

	/**
	 * Sum all element of list
	 * @param node 
	 * @param sum
	 * @return : sum of elements.
	 */
	int sumOfelements(Node node, int sum) {

		if (node != null) {
			if (node.getTag() == 0) {
				sum = sum + (int) node.getData();
				sum = sumOfelements(node.getNext(), sum);
			} else {
				sum = sumOfelements((Node) node.getData(), sum);
				sum = sumOfelements(node.getNext(), sum);

			}

		}
		return sum;
	}

	/**
	 * display all nodes
	 * @param node
	 */
	void display(Node node) {
		if (node != null) {
			if (node.getTag() == 0) {
				System.out.println(node.getData());
				display(node.getNext());
			} else {
				display((Node) node.getData());
				display(node.getNext());
			}
		}
	}

	/**
	 * Calculates Maximum value element
	 * @param node
	 * @param max
	 * @return : max value.
	 */
	int max(Node node, int max) {
		if (node != null) {
			if (node.getTag() == 0) {
				if (max < (int) node.getData())
					max = (int) node.getData();
				max = max(node.getNext(), max);

			} else {
				max = max((Node) node.getData(), max);
				max = max(node.getNext(), max);

			}

		}
		return max;
	}

	/**
	 * Finds element in list
	 * @param element
	 * @return : true if element found.
	 */
	boolean find(int element) {
		return search(start, element, false);
	}

	/**
	 * Finds element in list by recursive call.
	 * @param node
	 * @param element
	 * @param search
	 * @return : true if element found.
	 */
	boolean search(Node node, int element, boolean search) {
		if (node != null) {
			if (node.getTag() == 0) {
				if ((int) node.getData() == element) {
					return true;
				}
				search = search(node.getNext(), element, search);
			} else {
				search = search((Node) node.getData(), element, search);
				search = search(node.getNext(), element, search);
			}
		}
		return search;
	}

}
