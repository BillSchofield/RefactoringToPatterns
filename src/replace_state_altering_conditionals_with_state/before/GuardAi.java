package replace_state_altering_conditionals_with_state.before;

import replace_state_altering_conditionals_with_state.Actor;

import static replace_state_altering_conditionals_with_state.before.GuardAi.State.*;

public class GuardAi {
    public enum State {
        Dead,
        Unconscious,
        Asleep,
        Patrolling,
        Fighting
    }

    State currentState;
    private final Actor myActor;

    public GuardAi(State currentState, Actor myActor) {
        this.currentState = currentState;
        this.myActor = myActor;
    }

    public void setState(State desiredState){
        switch(desiredState){
            case Dead:
                currentState = Dead;
                break;
            case Unconscious:
                if (currentState != Dead || myActor.hitPoints() > 0){
                    currentState = Unconscious;
                }
                break;
            case Asleep:
                if (currentState != Dead){
                    currentState = Asleep;
                }
                break;
            case Patrolling:
                if (currentState != Dead){
                    currentState = Patrolling;
                }
                break;
            case Fighting:
                if (currentState != Dead){
                    currentState = Fighting;
                }
                break;
        }

    }

    public void update(){
        switch(currentState){
            case Dead:
                // Do nothing
                break;
            case Unconscious:
                break;
            case Asleep:
                myActor.snore();
                break;
            case Patrolling:
                myActor.followPath();
                break;
            case Fighting:
                myActor.attackCurrentTarget();
                break;
        }
    }
}
