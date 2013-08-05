package replace_state_altering_conditionals_with_state.after;

import replace_state_altering_conditionals_with_state.Actor;
import replace_state_altering_conditionals_with_state.after.state.State;

public class GuardAi {
    State currentState;

    public GuardAi(State currentState, Actor myActor) {
        this.currentState = currentState;
    }

    public void setState(State desiredState){
        currentState = currentState.nextState(desiredState);
    }

    public void update(){
        currentState.update();
    }
}
