package replace_state_altering_conditionals_with_state.after.state;

import replace_state_altering_conditionals_with_state.Actor;

public abstract class State {
    protected Actor myActor;

    public State(Actor myActor){
        this.myActor = myActor;
    }

    public abstract State nextState(State desiredState);
    public abstract void update();
}
