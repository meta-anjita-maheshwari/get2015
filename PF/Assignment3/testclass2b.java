package Assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass2b {

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

	@Test																			//test case when number to be searched is present in array
	public void test1() {
		Assignment2b bsearch= new Assignment2b();
		int arr[]={2,5,8,9,10,77};
		int sno=77;
		int exp=5;																	//expected value is index of number.
		int ans=bsearch.binarySearch(arr,sno,0,arr.length-1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																			//test case when number to be searched is not present in array
	public void test2() {
		Assignment2b bsearch= new Assignment2b();
		int arr[]={2,5,8,9,10,77};
		int sno=55;
		int exp=-1;
		int ans=bsearch.binarySearch(arr,sno,0,arr.length-1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																			//negative test case when number to be searched is present in array but at some other index
	public void test3() {
		Assignment2b bsearch= new Assignment2b();
		int arr[]={2,5,8,9,10,77};
		int sno=10;
		int exp=3;
		int ans=bsearch.binarySearch(arr,sno,0,arr.length-1);
		assertEquals("fail",exp,ans);
	}

}
