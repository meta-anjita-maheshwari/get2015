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
public class BinarySearchTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// positive test case
	@Test
	public void testBinarySearchFound() {
		BinarySearch object = new BinarySearch();
		int a[] = new int[] { 2, 5, 8, 9, 10, 15, 30, 45, 55, 77 };
		int element1 = object.binarySearch(30, 0, a.length - 1, a);
		assertEquals(6, element1);
	}

	// positive test case
	@Test
	public void testBinarySearchNotFound() {
		BinarySearch object = new BinarySearch();
		int a[] = new int[] { 2, 5, 8, 9, 10, 15, 30, 45, 55, 77 };
		int element1 = object.binarySearch(11, 0, a.length - 1, a);
		assertEquals(-1, element1);
	}

	// Negative test case
	@Test
	public void testBinarySearch() {
		BinarySearch object = new BinarySearch();
		int a[] = new int[] { 2, 5, 8, 9, 10, 15, 30, 45, 55, 77 };
		int element1 = object.binarySearch(30, 0, a.length - 1, a);
		assertEquals(7, element1);
	}

}
