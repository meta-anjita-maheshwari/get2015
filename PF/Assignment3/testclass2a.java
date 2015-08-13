package Assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass2a {

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
																			//test classes where expected values are the index of searching element in array.
	@Test																	//test class when number is present in the array
	public void test1() {
		Assignment2a linear= new Assignment2a();
		int arr[]={23,4,21,7,58};
		int sno=4;
		int exp=1;
		int ans=linear.linearSearch(arr,sno,arr.length-1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																	//test class when number is not present in the array
	public void test2() {
		Assignment2a linear= new Assignment2a();
		int arr[]={23,4,21,7,58};
		int sno=2;
		int exp=-1;
		int ans=linear.linearSearch(arr,sno,arr.length-1);
		assertEquals("correct",exp,ans);
	}
	
	@Test																	//negative test class where number is at index 1 but expected at index 2 
	public void test3() {
		Assignment2a linear= new Assignment2a();
		int arr[]={23,4,21,7,58};
		int sno=4;
		int exp=2;
		int ans=linear.linearSearch(arr,sno,arr.length-1);
		assertEquals("Fail",exp,ans);
	}

}
