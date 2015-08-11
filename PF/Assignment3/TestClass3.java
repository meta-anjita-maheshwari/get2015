package Assignments;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass3 {

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

	@Test
	// test class compares expected array and return values of array
	public void test1() {
		int arr[] = { 2, 5, 8, 9, 10, 77, 55, 11 };
		int exp[] = { 2, 5, 8, 9, 10, 11, 55, 77 };
		int ans[] = Assignment3.quickSort(arr, 0, 7);
		assertArrayEquals("Correct", exp, ans);
	}

	@Test
	// negative test class
	public void test2() {
		int arr[] = { 2, 5, 8, 9, 10, 77, 55, 11 };
		int exp[] = { 2, 5, 8, 9, 10, 55, 11, 77 };
		int ans[] = Assignment3.quickSort(arr, 0, 7);
		assertArrayEquals("Fail", exp, ans);
	}

}
