/**
 * DS Session8: question no 1
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
public class BinarySearchTestClass {

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
	 * Positive test case :- Tree sort
	 */
	@Test
	public void treeSortTest() {
		String answer="";
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(21);
		binarySearchTree.insert(7);
		binarySearchTree.insert(67);
		binarySearchTree.insert(25);
		binarySearchTree.insert(49);
		binarySearchTree.insert(111);
		binarySearchTree.insert(92);
		binarySearchTree.insert(3);
		answer=binarySearchTree.printInorder();
		String expected="3,7,21,25,49,67,92,111,";
		assertEquals("correct",expected,answer);
	}
	
	/**
	 * Negative test case :- Tree sort
	 */
	@Test
	public void treeSortTestNegative() {
		String answer="";
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(1);
		binarySearchTree.insert(1);
		binarySearchTree.insert(1);
		binarySearchTree.insert(1);
		binarySearchTree.insert(1);
		binarySearchTree.insert(1);
		binarySearchTree.insert(1);
		binarySearchTree.insert(1);
		answer=binarySearchTree.printInorder();
		String expected="1,1,1,1,1,1,1,1,";
		assertNotEquals("Fail",expected,answer);
	}

}
