package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass4 {

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
	// test class compares expected 2-D Array with the function return array
	public void test1() {
		Assignment4 fcfs1 = new Assignment4();
		int arrivalTime[] = { 1, 5, 9, 25 };
		int jobSize[] = { 12, 7, 2, 5 };
		int ans[][] = fcfs1.fcfs(arrivalTime, jobSize);
		int exp[][] = { { 1, 1, 0, 1, 12 }, { 2, 5, 8, 13, 19 },
				{ 3, 9, 11, 20, 21 }, { 4, 25, 0, 25, 29 } };
		assertArrayEquals("correct", exp, ans);
	}

	@Test
	// negative test case with first line exp value as 1,1,2,3,12 whereas it
	// should be 1,1,0,1,12
	public void test2() {
		Assignment4 fcfs1 = new Assignment4();
		int arrivalTime[] = { 1, 5, 9, 25 };
		int jobSize[] = { 12, 7, 2, 5 };
		int ans[][] = fcfs1.fcfs(arrivalTime, jobSize);
		int exp[][] = { { 1, 1, 2, 3, 12 }, { 2, 5, 8, 13, 19 },
				{ 3, 9, 11, 20, 21 }, { 4, 25, 0, 25, 29 } };
		assertArrayEquals("correct", exp, ans);
	}

}
