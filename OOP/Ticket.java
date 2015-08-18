package Assignment3;

/**
 * @author Anjita
 * this class contains ticket information
 */
public class Ticket {
	String name;
	String ticketId;
	int seat_weight;
	double amount;

	public Ticket(String name, String ticketId, int seat_weight, int amount) {
		super();
		this.name = name;
		this.ticketId = ticketId;
		this.seat_weight = seat_weight;
		this.amount = amount;
	}

	/**
	 * @return :- Person's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name of person set by setter
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return :- ticket ID
	 */
	public String getTicketId() {
		return ticketId;
	}

	/**
	 * @param ticketId set by setter
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * @return :- available seats/ weight capacity
	 */
	public int getSeat_weight() {
		return seat_weight;
	}

	/**
	 * @param seat_weight set by setter
	 */
	public void setSeat_weight(int seat_weight) {
		this.seat_weight = seat_weight;
	}

	/**
	 * @return :- Amount for booking
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount set by setter
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
