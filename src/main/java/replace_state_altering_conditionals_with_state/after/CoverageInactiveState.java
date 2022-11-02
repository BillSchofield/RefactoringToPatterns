package replace_state_altering_conditionals_with_state.after;


public class CoverageInactiveState implements State {

	@Override
	public State handleEvent(Event event) {
		State newState = this;
		switch (event) {
			case PaymentMade:
				newState = new CoverageActiveState();
				notifyPolicyholderOfAccountActivation();
				break;
		}

		return newState;
	}

	private void notifyPolicyholderOfAccountActivation() {
		System.out.println("Notify Policyholder of Activation");
	}
}
