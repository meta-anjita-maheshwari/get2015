/**
 * 
 */
package session1;

import java.util.List;

/**
 * @author Anjita
 *
 */
public class VehicleMain {
	public static void main(String args[]) {
		VehicalParsing vehicalParsing = new VehicalParsing();
		//VehiclesJdbcClass jdbcClass = new VehiclesJdbcClass();
		List<Vehicle> listCar = vehicalParsing.readConfig("../CaseStudy/src/session1/Car.xml");
		for (Vehicle vehicle : listCar) {
			System.out.println(VehiclesJdbcClass.insertIntoVehicle(vehicle));
		}
		
		List<Vehicle> listBike = vehicalParsing.readConfig("../CaseStudy/src/session1/Bike.xml");
		for (Vehicle vehicle : listBike) {
			VehiclesJdbcClass.insertIntoVehicle(vehicle);
		}
	}
} 
