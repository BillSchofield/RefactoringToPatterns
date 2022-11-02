package move_embellishment_to_decorator.before;

public class Account {
	private double balance = 0.0;

	public void deduct(double amountToDeduct) {
		balance -=  amountToDeduct;
	}

	public void credit(double amountToCredit) {
		balance += amountToCredit;
	}

	public double balance() {
		return balance;
	}
}
