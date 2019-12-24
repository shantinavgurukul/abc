package simpletest;

public class AccountExample {
	String firstName;
	String LastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditcard;

	public void testEligibilityForCreditCard() {
		if (age > 25 && accountBalance >= 20000) {
			eligibleForCreditcard = true;
		}
	}

}
