package Assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass1c {

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

	@Test																		//test class when the number is of one digit only. The no itself will be the largest digit
	public void test1() {
		Assignment1c largest= new Assignment1c();
		int no1= 2;
		int exp= 2;
		int ans= largest.largestDigit(no1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																		//test class for number having more than one digit
	public void test2() {
		Assignment1c largest= new Assignment1c();
		int no1= 1257369;
		int exp= 9;
		int ans= largest.largestDigit(no1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																		//test class when all digits of the number are same
	public void test3() {
		Assignment1c largest= new Assignment1c();
		int no1= 444;
		int exp= 4;
		int ans= largest.largestDigit(no1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																		//a negative test class. we are taking expected largest value which is not largest.
	public void test4() {
		Assignment1c largest= new Assignment1c();
		int no1= 284;
		int exp= 4;
		int ans= largest.largestDigit(no1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																		//a negative test class. We are expecting the digit as largest which is not present in the number.
	public void test5() {
		Assignment1c largest= new Assignment1c();
		int no1= 183;
		int exp= 7;
		int ans= largest.largestDigit(no1);
		assertEquals("correct",exp,ans);
	}

}
