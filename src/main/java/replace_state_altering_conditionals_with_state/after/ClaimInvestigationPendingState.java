package replace_state_altering_conditionals_with_state.after;


public class ClaimInvestigationPendingState implements State {

	@Override
	public State handleEvent(Event event) {
		State newState = this;
		switch (event) {
			case InvestigationPassed:
				newState = new CoverageActiveState();
				freeInvestigator();
				payClaim();
				break;
			case InvestigationFailed:
				newState = new CoverageActiveState();
				freeInvestigator();
				denyClaim();
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

	private void payClaim() {
		System.out.println("Claim Paid");
	}

	private void denyClaim() {
		System.out.println("Claim Denied");
	}

	private void freeInvestigator() {
		System.out.println("Investigator Freed");
	}
}
