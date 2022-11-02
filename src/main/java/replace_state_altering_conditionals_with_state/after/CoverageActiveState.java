package replace_state_altering_conditionals_with_state.after;


public class CoverageActiveState implements State {
	@Override
	public State handleEvent(Event event) {
		State newState = this;
		switch (event) {
			case ClaimFiled:
				newState = new ClaimInvestigationPendingState();
				assignInvestigator();
				break;
			case PaymentMissed:
				newState = new CoverageInactiveState();
				notifyPolicyholderOfAccountDeactivation();
				break;
		}
		return newState;
	}

	private void notifyPolicyholderOfAccountDeactivation() {
		System.out.println("Notify Policyholder of Deactivation");
	}

	private void assignInvestigator() {
		System.out.println("Investigator Assigned");
	}
}