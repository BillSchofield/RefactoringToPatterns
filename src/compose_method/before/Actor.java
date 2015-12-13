package compose_method.before;

import static compose_method.before.Actor.Status.Alive;
import static compose_method.before.Actor.Status.Dead;
import static java.lang.Float.MAX_VALUE;

public class Actor {
    enum Status {Alive, Dead}
    private final Float maximumHitPoints;
    private Float currentHitPoints;
    private Float lastChange;
    private Status currentStatus;


    public Actor(Float maximumHitPoints) {
        this.maximumHitPoints = maximumHitPoints;
        this.currentHitPoints = this.maximumHitPoints;
        this.currentStatus = Alive;
    }

    public void changeHitPoints(Float change){
        if (change < 0.0f){
            currentHitPoints += change;
            if (currentHitPoints < 0.0f){
                currentHitPoints = 0.0f;
                currentStatus = Dead;
            }
        } else if (change > 0.0f){
            if (change == MAX_VALUE){
                if (currentStatus == Dead){
                    currentStatus = Alive;
                    currentHitPoints = maximumHitPoints;
                }
            }
            currentHitPoints += change;
            if (currentHitPoints > maximumHitPoints){
                currentHitPoints = maximumHitPoints;
            }
        } else {
            if (lastChange != 0.0f){
                changeHitPoints(lastChange);
            }
        }
        lastChange = change;
    }
}
