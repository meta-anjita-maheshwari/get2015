package session1;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehiclePrinterTest {

	@Test
	public void testVehiclePrint() {
		// checking for object of car
		String object2 = "make:Verna,model:verna23";
		String object1 = VehiclePrinter.printVehicleSpecification(VehicleHelper
				.createVehicle(VehicleType.CAR, "Verna", "verna23"));
		assertEquals(object1, object2);
	}

}
