package session1;

/**
 * @author Anjita 
 * Car class derived from Vehicle class
 * 
 */
public class Car extends Vehicle {
	private boolean AC;
	private boolean powerSteering;
	private String accessoryKit;

	/**
	 * @return the aC
	 */
	public boolean isAC() {
		return AC;
	}

	/**
	 * @param aC the aC to set
	 */
	public void setAC(boolean aC) {
		AC = aC;
	}

	/**
	 * @return the powerSteering
	 */
	public boolean isPowerSteering() {
		return powerSteering;
	}

	/**
	 * @param powerSteering the powerSteering to set
	 */
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	/**
	 * @return the accessoryKit
	 */
	public String getAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * @param accessoryKit the accessoryKit to set
	 */
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	public double calculateOnRoadPrice() {// Over written function from base class
		return getPrice() + getRoadTax() * 100;

	}

}
