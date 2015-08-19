package Assignment3;

/**
 * @author Anjita this class contains passenger information
 */
public class Passenger {
	String name;
	char trainType;

	public Passenger(String name, char trainType) {
		super();
		this.name = name;
		this.trainType = trainType;
	}

	/**
	 * @return :- name of passenger
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            set by setter
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return :- type of train(Goods or Passenger)
	 */
	public char getTrainType() {
		return trainType;
	}

	/**
	 * @param trainType
	 *            set by setter
	 */
	public void setTrainType(char trainType) {
		this.trainType = trainType;
	}

}
