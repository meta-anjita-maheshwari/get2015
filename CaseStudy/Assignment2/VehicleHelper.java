package session1;

/**
 * @author Anjita
 * Helper class to create objects of vehicle type and returning them
 */
public class VehicleHelper {
	public static Vehicle createVehicle(VehicleType vehicleType, String make,
			String model) {
		if (vehicleType.equals(VehicleType.CAR)) {
			// checking for car type
			Car car = new Car();
			// calling constructor
			return car;
		} else if (vehicleType.equals(VehicleType.BIKE)) {
			// checking for bike type

			Bike bike = new Bike();
			// calling constructor
			return bike;
		} else {
			Vehicle vehicle = new Vehicle();
			return vehicle;

		}
	}

}
