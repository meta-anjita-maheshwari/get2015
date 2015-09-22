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
public class VehiclesJdbcClassTest {

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
	VehicalParsing vehicalParsing = new VehicalParsing();
	List<Vehicle> listCar = vehicalParsing.readConfig("../CaseStudy/src/session1/Car.xml");
	List<Vehicle> listBike = vehicalParsing.readConfig("../CaseStudy/src/session1/Bike.xml");
	
	//test case for method insert into vehicle
	@Test
	public void insertIntoVehicleTest() {
		boolean expected = true;
		boolean actual = false;
		for(Vehicle vehicle : listCar){
			actual = VehiclesJdbcClass.insertIntoVehicle(vehicle);
		}
		for(Vehicle vehicle : listBike){
			actual = (VehiclesJdbcClass.insertIntoVehicle(vehicle));
		}
		assertEquals( expected, actual);
	}
	

}
