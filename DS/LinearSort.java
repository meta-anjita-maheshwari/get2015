/**
 * DS Session8: question no 2
 */
package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class LinearSort {
	
	/**
	 * @param array :- array that to be sorted
	 * @param max :- maximum value
	 * @return :- sorted array
	 */
	public int[] countingSort(int array[]) {
		int max=this.maximumValue(array);
		int temp[] = new int[max + 1];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			temp[array[i]] += 1;
		}
		for (int i = 0; i < temp.length; i++) {
			while (temp[i] != 0) {
				array[count++] = i;
				temp[i]--;
			}

		}
		return array;
	}

	/**
	 * function to find maximum value in input array
	 * @param array :-
	 *            array that to be sorted
	 * @return max :- maximum value
	 */
	public int maximumValue(int array[]) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];

			}
		}
		return max;
	}
	
	/**
	 * function to find maximum value's number of digit in input array
	 * @param array :- array that to be sorted
	 * @return :- number of digit of maximum number
	 */
	public int maximumDigit(int array[]){
		int maxd=0;
		int max=this.maximumValue(array);
		while(max!=0){
			maxd++;
			max/=10;
		}
		return maxd;
	}

	/**
	 * @param array :- array that to be sorted
	 * @return :- sorted array
	 */
	public int[] radixSort(int array[]) {
		int temp = 0, i = 0,count=0, temp1;
		int maxDigit=this.maximumDigit(array);
		ArrayList<Integer>[] arraylist = new ArrayList[10];
		for (int j = 0; j < 10; j++) {
			arraylist[j] = new ArrayList<Integer>();
		}

		while (count != maxDigit) {
			for (i = 0; i < array.length; i++) {
				temp1 = array[i] / (int) Math.pow(10, count);
				temp = temp1 % 10;
				arraylist[temp].add(array[i]);
			}

			for (int k = 0, j = 0; k < arraylist.length; k++) {
				Iterator iterator = arraylist[k].iterator();
				while (iterator.hasNext()) {
					array[j++] = (int) iterator.next();
				}
				arraylist[k].clear();
			}

			count++;
		}

		return array;

	}
}
