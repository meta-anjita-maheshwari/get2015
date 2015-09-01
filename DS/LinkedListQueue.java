package Assignments;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Anjita
 * 
 */

class LinkedListQueue {
	private LinkedList<String> queue;
	
	/**
	 *  Constructor 
	 */
	public LinkedListQueue() {
		queue = new LinkedList<String>();
	}


	/** 
	 * get the size of the queue 
	 * @return :- size
	 */
	public int getSize() {
		return queue.size();
	}


	/**
	 * insert an element to the queue
	 * @param data :- to insert in queue
	 */
	public void enqueue(String data) {
		queue.addLast(data);
	}

	
	/**
	 * remove front element from the queue
	 * @return :- first data to be removed
	 */
	public String dequeue() {
		return queue.removeFirst();

	}

	
	/**
	 * check the front element of the queue 
	 * @return :- front element from queue
	 */
	public String getFront() {
		return queue.getFirst();
	}

	
	/**
	 * display the element of the queue
	 */
	public void display() {
		int i = 1;
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println("Element at" + i + "position is : "
					+ itr.next());
			i++;
		}
		if(queue.size()==0) {
			System.out.println("No element in queue");	
		}
	}

	/**
	 * make queue empty 
	 */
	void makeEmpty() {
		queue.removeAll(queue);
	}

}
