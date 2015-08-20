package Assignments;

/**
 * @author Anjita
 * this class contains payment detail
 * there are three options for payment
 */
public class Payment {
	/**
	 * @param creditCardNo :- credit card number
	 * @param ccv :- CCV of credit card
	 */
	public void creditCard(int creditCardNo, int ccv) {
		System.out
				.println("Payment has been done by credit card with credit card no"
						+ creditCardNo);
	}

	/**
	 * Payment is by wallet
	 */
	public void wallet() {
		System.out.println("Payment has been done in cash");
	}

	/**
	 * @param bankName:- bank name
	 * @param userName:- User Name of person
	 * @param password:- password of person
	 */
	public void netBanking(String bankName, String userName, String password) {
		System.out
				.println("Payment has been done by net banking by" + userName);
	}
}
