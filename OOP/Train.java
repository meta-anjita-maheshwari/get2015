package Assignment3;

/**
 * @author Anjita class train containing information of train
 */
public class Train {
	String type;
	int trainId;
	int seats;
	int weight;
	String fromTo;
	int charge;

	public Train(String type, int trainId, int seats, int weight,
			String fromTo, int charge) {
		super();
		this.type = type;
		this.trainId = trainId;
		this.seats = seats;
		this.weight = weight;
		this.fromTo = fromTo;
		this.charge = charge;
	}

	/**
	 * @return :- type of train
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            set by setter
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return :- Train ID
	 */
	public int getTrainId() {
		return trainId;
	}

	/**
	 * @param trainId
	 *            set by setter
	 */
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	/**
	 * @return :-number of seats available
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * @param seats
	 *            set by setter
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @return :- weight capacity
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            set by setter
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return :- train is from where to where
	 */
	public String getFromTo() {
		return fromTo;
	}

	/**
	 * @param fromTo
	 *            set by setter
	 */
	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}

	/**
	 * @return :- Amount of booking
	 */
	public int getCharge() {
		return charge;
	}

	/**
	 * @param charge
	 *            set by setter
	 */
	public void setCharge(int charge) {
		this.charge = charge;
	}

	public String toString() {
		return type + " " + trainId + " " + seats + " " + weight + " " + fromTo;
	}

}
