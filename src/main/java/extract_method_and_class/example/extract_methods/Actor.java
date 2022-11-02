package extract_method_and_class.example.extract_methods;

import static extract_method_and_class.example.extract_methods.Actor.Status.Alive;
import static extract_method_and_class.example.extract_methods.Actor.Status.Dead;
import static java.lang.Float.MAX_VALUE;

public class Actor {
    enum Status {Alive, Dead}
    private Status currentStatus;
    private final Float maximumHitPoints;
    private Float currentHitPoints;
    private Float lastChange;


    public Actor(Float maximumHitPoints) {
        this.maximumHitPoints = maximumHitPoints;
        bringToLife();
    }

    public void changeHitPoints(Float hitPointChange){
        if (isDamage(hitPointChange)){
            applyDamage(hitPointChange);
        } else if (isHealing(hitPointChange)){
            applyHealing(hitPointChange);
        } else {
            reapplyLastChange();
        }
        rememberLastChange(hitPointChange);
    }

    public void reportStatus() {
        System.out.println(currentStatus.toString());
    }

    private void rememberLastChange(Float hitPointChange) {
        lastChange = hitPointChange;
    }

    private void reapplyLastChange() {
        changeHitPoints(lastChange);
    }

    private void applyHealing(Float hitPointChange) {
        if (isRaiseDead(hitPointChange)){
            bringToLifeIfDead();
        }
        updateHitPoints(hitPointChange);
        capHitPointsAtMaximum();
    }

    private boolean isDamage(Float hitPointChange) {
        return hitPointChange < 0.0f;
    }

    private boolean isHealing(Float hitPointChange) {
        return hitPointChange > 0.0f;
    }

    private void applyDamage(Float hitPointChange) {
        updateHitPoints(hitPointChange);
        killMonsterIfNoRemainingHitPoints();
    }

    private boolean isRaiseDead(Float hitPointChange) {
        return hitPointChange == MAX_VALUE;
    }

    private void capHitPointsAtMaximum() {
        if (currentHitPoints > maximumHitPoints){
            currentHitPoints = maximumHitPoints;
        }
    }

    private void bringToLifeIfDead() {
        if (currentStatus == Dead){
            bringToLife();
        }
    }

    private void bringToLife() {
        currentHitPoints = maximumHitPoints;
        currentStatus = Alive;
    }

    private void killMonsterIfNoRemainingHitPoints() {
        if (currentHitPoints < 0.0f){
            currentHitPoints = 0.0f;
            currentStatus = Dead;
        }
    }

    private void updateHitPoints(Float hitPointChange) {
        currentHitPoints += hitPointChange;
    }

}