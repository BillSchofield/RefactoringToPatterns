package replace_state_altering_conditionals_with_state.before;

import static replace_state_altering_conditionals_with_state.before.InsurancePolicy.State.*;

public class InsurancePolicy {
	public enum State {
		CoverageActive,
		ClaimInvestigationPending,
		CoverageInactive,
	}

	private State currentState;

	public InsurancePolicy(State currentState) {
		this.currentState = currentState;
	}

	public void handleEvent(Event event) {
		switch (event) {
			case ClaimFiled:
				if (currentState == CoverageActive) {
					currentState = ClaimInvestigationPending;
					assignInvestigator();
				}
				break;
			case InvestigationPassed:
				if (currentState == ClaimInvestigationPending) {
					currentState = CoverageActive;
					freeInvestigator();
					payClaim();
				}
				break;
			case InvestigationFailed:
				if (currentState == ClaimInvestigationPending) {
					currentState = CoverageActive;
					freeInvestigator();
					denyClaim();
				}
				break;
			case PaymentMissed:
				if (currentState != CoverageInactive) {
					currentState = CoverageInactive;
					notifyPolicyholderOfAccountDeactivation();
				}
				break;
			case PaymentMade:
				if (currentState == CoverageInactive) {
					currentState = CoverageActive;
					notifyPolicyholderOfAccountActivation();
				}
				break;
		}
	}

	private void notifyPolicyholderOfAccountActivation() {
		System.out.println("Notify Policyholder of Activation");
	}

	private void notifyPolicyholderOfAccountDeactivation() {
		System.out.println("Notify Policyholder of Deactivation");
	}

	private void denyClaim() {
		System.out.println("Claim Denied");
	}

	private void payClaim() {
		System.out.println("Claim Paid");
	}

	private void freeInvestigator() {
		System.out.println("Investigator Freed");
	}

	private void assignInvestigator() {
		System.out.println("Investigator Assigned");
	}
}
