package replace_state_altering_conditionals_with_state.after;

public class InsurancePolicy {
    private State currentState;

    public InsurancePolicy(State currentState) {
        this.currentState = currentState;
    }

    public void handleEvent(Event event){
        currentState = currentState.handleEvent(event);
    }

}
