/**
 * DS Session8: question no 2
 */
package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Anjita
 *
 */
public class SortingTestClass {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * positive test class :- Radix sort
	 */
	@Test
	public void radixTest() {
		LinearSort radix = new LinearSort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17 };
		int answer[] = radix.radixSort(input);
		int expected[] = { 2, 13, 17, 71, 454, 710, 1222, 1520 };
		assertArrayEquals("correct", expected, answer);
	}

	/**
	 * negative test class :- Radix sort
	 */
	@Test
	public void radixTestNegative() {
		LinearSort radix = new LinearSort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17 };
		int answer[] = radix.radixSort(input);
		for (int i = 1; i < answer.length; i++) {
			if (answer[i - 1] > answer[i]) {
				fail("radix sort fails");
			}
		}
	}

	/**
	 * positive test class :- Counting sort
	 */
	@Test
	public void countingTest() {
		LinearSort counting = new LinearSort();
		int input[] = { 11, 3, 21, 11, 42, 21, 7, 3 };
		int answer[] = counting.countingSort(input);
		int expected[] = { 3, 3, 7, 11, 11, 21, 21, 42 };
		assertArrayEquals("correct", expected, answer);
	}

	/**
	 * negative test class :- Counting sort
	 */
	@Test
	public void countingTestNegative() {
		LinearSort counting = new LinearSort();
		int input[] = { 11, 3, 21, 11, 42, 21, 7, 3 };
		int answer[] = counting.countingSort(input);
		for (int i = 1; i < answer.length; i++) {
			if (answer[i - 1] > answer[i]) {
				fail("counting sort fails");
			}
		}
	}

	/**
	 * positive test class :- bubble sort
	 */
	@Test
	public void bubbleTest() {
		ComparisonSort bubble = new ComparisonSort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17 };
		int answer[] = bubble.bubbleSort(input);
		int expected[] = { 2, 13, 17, 71, 454, 710, 1222, 1520 };
		assertArrayEquals("correct", expected, answer);
	}

	/**
	 * negative test class :- bubble sort
	 */
	@Test
	public void bubbleTestNegative() {
		ComparisonSort bubble = new ComparisonSort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17 };
		int answer[] = bubble.bubbleSort(input);
		for (int i = 1; i < answer.length; i++) {
			if (answer[i - 1] > answer[i]) {
				fail("bubble sort fails");
			}
		}
	}

	/**
	 * positive test class :- Quick sort
	 */
	@Test
	public void quickTest() {
		ComparisonSort quick = new ComparisonSort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17, 88, 25, 61, 43 };
		int answer[] = quick.quickSort(0, input.length - 1, input);
		int expected[] = { 2, 13, 17, 25, 43, 61, 71, 88, 454, 710, 1222, 1520 };
		assertArrayEquals("correct", expected, answer);
	}

	/**
	 * negative test class :- Quick sort
	 */
	@Test
	public void quickTestNegative() {
		ComparisonSort quick = new ComparisonSort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17, 88, 25, 61, 43 };
		int answer[] = quick.quickSort(0, input.length-1, input);
		for (int i = 1; i < answer.length; i++) {
			if (answer[i - 1] > answer[i]) {
				fail("quick sort fails");
			}
		}
	}

}
