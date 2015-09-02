package Assignments;

/**
 * @author Anjita
 * 
 */
public class BinarySearch {

	/**
	 * Recursive Binary Search In array
	 * 
	 * @param element
	 *            :element to search
	 * @param startIndex
	 *            :Starting Index of Array
	 * @param endIndex
	 *            :End Index of array
	 * @param array
	 *            :Array where element to be searched
	 * @return :returns index of array if found else -1
	 */
	public int binarySearch(int element, int startIndex, int endIndex,
			int array[]) {
		int midValue;
		// Loop invariant :
		// 1 :startValue is always less than endValue
		// 2 : If array[mid]==key then return mid
		while (startIndex <= endIndex) {

			midValue = (startIndex + endIndex) / 2;
			if (element == array[midValue]) {// if found at mid index
				return midValue; // Returning position of number found
			} else if (element > array[midValue]) { // If element is in Left sub
													// array
				return (binarySearch(element, midValue + 1, endIndex, array));
			} else { // If element is in right sub array
				return (binarySearch(element, startIndex, midValue - 1, array));
			}
		}
		return -1;
	}

	/**
	 * To find Left Occurrence of element.
	 * 
	 * @param element
	 *            :element to search
	 * @param leftIndex
	 *            :index of array
	 * @param array
	 *            :Array where element to be searched
	 * @return :Left occurrence of element
	 */
	public int leftOccurrenceOfElement(int element, int leftIndex, int array[]) {
		// Loop invariant :
		// 1 :leftIndex should always be greater than zero
		while (leftIndex > 0 && array[leftIndex - 1] == element) {
			leftIndex--;
		}

		return leftIndex;
	}

}
