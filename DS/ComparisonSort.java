/**
 * DS Session8: question no 2
 */
package Assignments;

public class ComparisonSort {
	/**
	 * @param array :- array that has to be sorted
	 * @return :- Sorted array
	 */
	public int[] bubbleSort(int array[]) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * function for Quick sorting
	 * @param startIndex
	 * @param endIndex
	 * @param input :-
	 *            array that to be sorted
	 * @return :- Sorted array
	 */
	public int[] quickSort(int startIndex, int endIndex, int array[]) {
		if (startIndex <= array.length - 1 && endIndex >= 0
				&& startIndex < endIndex) {
			int pivotIndex = startIndex;
			int storeIndex = pivotIndex + 1;
			for (int count = pivotIndex + 1; count <= endIndex; count++) {
				if (array[count] < array[pivotIndex]) {
					// swapping
					swap(count, storeIndex, array);
					storeIndex++;
				}
			}
			swap(pivotIndex, storeIndex - 1, array);
			for (int count = 0; count < array.length; count++)
				quickSort(startIndex, storeIndex - 2, array);
			quickSort(storeIndex, endIndex, array);
		}
		return array;
	}

	/**
	 * function to swap numbers
	 * 
	 * @param x :-
	 *            index
	 * @param y :-
	 *            index
	 * @param input :-
	 *            array
	 */
	public void swap(int x, int y, int[] array) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

	/**
	 * function for display
	 * @param array
	 */
	public void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}
}
