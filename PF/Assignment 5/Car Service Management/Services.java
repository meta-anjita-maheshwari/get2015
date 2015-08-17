


/**
 * @author Anjita
 *
 */
public class Services {
	String personName;//name of the mechanic
	String carType;//type of car
	double serviceRate;//service rate of car
	int carNumber;//car number

	public Services(String personName, String carType, double serviceRate,
			int carNumber) {
		super();
		this.personName = personName;
		this.carType = carType;
		this.serviceRate = serviceRate;
		this.carNumber = carNumber;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public double getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) {
		this.serviceRate = serviceRate;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

}
