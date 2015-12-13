package replace_state_altering_conditionals_with_state.after.state;

import replace_state_altering_conditionals_with_state.Actor;

public class PatrollingState extends State {

    public PatrollingState(Actor myActor) {
        super(myActor);
    }

    public State nextState(State desiredState) {
        return desiredState;
    }

    public void update() {
        myActor.followPath();
    }
}
