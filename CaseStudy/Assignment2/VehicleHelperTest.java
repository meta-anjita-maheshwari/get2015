package session1;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleHelperTest {

	@Test
	// checking for car type object
	public void testCarNotNull() {

		assertNotNull(VehicleHelper.createVehicle(VehicleType.CAR, "Verna", "verna23"));

	}

	@Test
	// checking for bike type object
	public void testBikeNotNull() {

		assertNotNull(VehicleHelper.createVehicle(VehicleType.BIKE, "Honda", "honda23"));

	}

}
