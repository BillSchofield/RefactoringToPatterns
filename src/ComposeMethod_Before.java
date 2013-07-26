import static ComposeMethod_Before.Status.Alive;
import static ComposeMethod_Before.Status.Dead;
import static java.lang.Float.MAX_VALUE;

public class ComposeMethod_Before {
    enum Status {Alive, Dead}
    private final Float maximumHitPoints;
    private Float currentHitPoints;
    private Float lastChange;
    private Status currentStatus;


    public ComposeMethod_Before(Float maximumHitPoints) {
        this.maximumHitPoints = maximumHitPoints;
        this.currentHitPoints = this.maximumHitPoints;
        this.currentStatus = Alive;
    }

    public void changeMonsterHitPoints(Float hitPointChange){
        if (hitPointChange < 0.0f){
            currentHitPoints += hitPointChange;
            if (currentHitPoints < 0.0f){
                currentHitPoints = 0.0f;
                currentStatus = Dead;
            }
        } else if (hitPointChange > 0.0f){
            if (hitPointChange == MAX_VALUE){
                if (currentStatus == Dead){
                    currentStatus = Alive;
                    currentHitPoints = maximumHitPoints;
                }
            }
            currentHitPoints += hitPointChange;
            if (currentHitPoints > maximumHitPoints){
                currentHitPoints = maximumHitPoints;
            }
        } else {
            if (lastChange != 0.0f){
                changeMonsterHitPoints(lastChange);
            }
        }
        lastChange = hitPointChange;
    }
}
