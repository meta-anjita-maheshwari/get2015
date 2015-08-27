package Assignments;

/**
 * @author Anjita this class implements Queue basic functions using ArrayList
 * @param front
 *            :- hold the location in queue where dequeue possible
 * @param rear
 *            :- hold the location in queue where enqueue possible
 */

public class Queue {

	Object list[];
	int size = 0;
	int front = -1;
	int rear = -1;

	public Queue(int n) {
		list = new Object[n];
		size = n;

	}

	/**
	 * @param item
	 *            :- add object to queue at front
	 */
	void enQueue(Object item) {
		if (rear < size - 1) {
			if (rear == -1) {// check queue is empty
				rear = 0;
				front = 0;
				list[rear] = item;
			} else {
				list[++rear] = item;
			}
		} else {
			System.out.println("Overflow");
		}
	}

	/**
	 * remove object from rear of queue and return object
	 * 
	 * @return deleted element
	 */
	Object deQueue() {
		Object object = null;
		if (front == rear + 1 || front == -1) {// check queue is empty
			System.out.println("Queue is empty");
		} else {
			object = list[front];
			front++;
			if (front == rear + 1) {
				front = -1;
				rear = -1;
			}
		}
		return object;
	}

	/**
	 * Remove all items of queue and make queue empty
	 */
	void makeEmpty() {
		rear = -1;
		front = -1;
	}
}
