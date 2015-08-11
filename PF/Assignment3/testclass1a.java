package Assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass1a {

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
	// test class for fully divisible values
	public void test1() {
		Assignment1a remain = new Assignment1a();
		int no1 = 2;
		int no2 = 1;
		int exp = 0;
		int ans = remain.rem(no1, no2);
		assertEquals("correct", exp, ans);
	}

	@Test
	// test class for one value zero. expected value -1 shows that division is
	// not possible
	public void test2() {
		Assignment1a remain = new Assignment1a();
		int no1 = 2;
		int no2 = 0;
		int exp = -1;
		int ans = remain.rem(no1, no2);
		assertEquals("correct", exp, ans);
	}

	@Test
	// test class for not fully divisible values. Here remainder is 1.
	public void test3() {
		Assignment1a remain = new Assignment1a();
		int no1 = 100;
		int no2 = 3;
		int exp = 1;
		int ans = remain.rem(no1, no2);
		assertEquals("correct", exp, ans);
	}

	@Test
	// this is a negative test class. Expected value is 6 but we have given 2 as
	// expected value.
	public void test() {
		Assignment1a remain = new Assignment1a();
		int no1 = 18;
		int no2 = 12;
		int exp = 2;
		int ans = remain.rem(no1, no2);
		assertEquals("Fail", exp, ans);
	}

}
