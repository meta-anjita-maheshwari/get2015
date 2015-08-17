

/**
 * @author Anjita
 *
 */
public class Cars {
	String type;//car type
	double serviceRate;//service rate of car

	public Cars(String type, double serviceRate) {
		super();
		this.type = type;
		this.serviceRate = serviceRate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) {
		this.serviceRate = serviceRate;
	}

}
