package replace_state_altering_conditionals_with_state.after.state;

import replace_state_altering_conditionals_with_state.Actor;

public class DeadState extends State {

    public DeadState(Actor myActor) {
        super(myActor);
    }

    public State nextState(State desiredState) {
        if (desiredState instanceof UnconsciousState && myActor.hitPoints() > 0){
            return desiredState;
        }
        return this;
    }

    public void update() {
        // Do nothing
    }
}
