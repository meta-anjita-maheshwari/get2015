/**
 * 
 */
package session1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Anjita
 *
 */
public class VehicalParsingTest {

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

	 VehicalParsing st = new VehicalParsing();
	
	@Test
	public void readConfigTest() {
		List<Vehicle> cars = st.readConfig("../CaseStudy/src/session1/Car.xml");
		List<Vehicle> bikes = st.readConfig("../CaseStudy/src/session1/Bike.xml");
		if(cars.size()==0 || bikes.size()==0) {
			fail("Objects are not created");
		}	
	}

}
