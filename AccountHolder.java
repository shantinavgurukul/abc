package simpletest;

public class AccountHolder {
	public static void main(String[] args) {
		AccountExample tom = new AccountExample();
		AccountExample henny = new AccountExample();
		AccountExample saran = new AccountExample();

		tom.firstName = "Tom";
		tom.LastName = "sharma";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom Eligible" + tom.eligibleForCreditcard);

		henny.firstName = "Henny";
		henny.LastName = "gupta";
		henny.age = 32;
		henny.accountBalance = 20000;
		henny.testEligibilityForCreditCard();
		System.out.println("Is henny Eligible" + henny.eligibleForCreditcard);

	}

}
