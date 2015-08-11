package Assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass1b {

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
																		//test classes for GCD calculation
	@Test																//test case where one number is 1.
	public void test1() {
		Assignment1b gcdAns= new Assignment1b();
		int no1=2;
		int no2=1;
		int exp=1;
		int ans=gcdAns.gcd(no1,no2);
		assertEquals("correct",exp,ans);
	}
	
	@Test																//test class for two numbers 12 & 18 with GCD=6.
	public void test2() {
		Assignment1b gcdAns= new Assignment1b();
		int no1=12;
		int no2=18;
		int exp=6;
		int ans=gcdAns.gcd(no1,no2);
		assertEquals("correct",exp,ans);
	}
	
	@Test																//test class of two numbers which has GCD=1.
	public void test3() {
		Assignment1b gcdAns= new Assignment1b();
		int no1=100;
		int no2=3;
		int exp=1;
		int ans=gcdAns.gcd(no1,no2);
		assertEquals("correct",exp,ans);
	}
	
	@Test																//negative test class. Expected value is 6 but taken as 10.
	public void test4() {
		Assignment1b gcdAns= new Assignment1b();
		int no1=12;
		int no2=18;
		int exp=10;
		int ans=gcdAns.gcd(no1,no2);
		assertEquals("correct",exp,ans);
	}

}
