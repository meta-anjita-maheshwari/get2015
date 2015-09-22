/**
 * 
 */
package session1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.metacube.jdbc.example.ConnectionUtil;

/**
 * @author Anjita
 *
 */
public class VehiclesJdbcClass {

	public static boolean insertIntoVehicle(Vehicle vehicle) {
		Connection con = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		int result;
		PreparedStatement ps = null;
		String query = "INSERT INTO vehicle VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, vehicle.getId());
			ps.setString(2, vehicle.getMake());
			ps.setString(3, vehicle.getModel());
			ps.setInt(4, vehicle.getEngineInCC());
			ps.setDouble(5, vehicle.getFuelCapacity());
			ps.setDouble(6, vehicle.getMilage());
			ps.setDouble(7, vehicle.getPrice());
			ps.setDouble(8, vehicle.getRoadTax());		
			ps.setString(9, vehicle.getCreatedBy());
			ps.setString(10, vehicle.getCreatedTime());

			result = ps.executeUpdate();
			
			if(result != 0){
				//System.out.println("first");
				if(vehicle instanceof Car){
					//System.out.println("second");
					Boolean b =insertIntoCar(vehicle);
					if(b==true) {
					return true;
					}
					return false;
				}
				else{
					boolean b =insertIntoBike(vehicle);
					if(b==true) {
					return true;
					}
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			/* close connection */
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	private static boolean insertIntoCar(Vehicle vehicle){
		Connection con = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		int result;
		PreparedStatement ps = null;
		String query = "INSERT INTO car VALUES(?, ?, ?, ?)";	
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, vehicle.getId());
			ps.setBoolean(2, ((Car)vehicle).isAC());
			ps.setBoolean(3, ((Car)vehicle).isPowerSteering());
			ps.setString(4, ((Car)vehicle).getAccessoryKit());

			result = ps.executeUpdate();
			if(result>0){
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			/* close connection */
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		return false;
	}
	
	private static boolean insertIntoBike(Vehicle vehicle){
		Connection con = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		int result;
		PreparedStatement ps = null;
		String query = "INSERT INTO bike VALUES(?, ?, ?)";	
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, vehicle.getId());
			ps.setBoolean(2, ((Bike)vehicle).getSelfStart());
			ps.setDouble(3, ((Bike)vehicle).getHelmetPrice());

			result = ps.executeUpdate();
			if(result>0){
				return true;
			}
			return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			/* close connection */
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
