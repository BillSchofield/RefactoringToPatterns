package compose_method.after_spawn_class;

import static compose_method.after_spawn_class.Actor.Status.Alive;
import static compose_method.after_spawn_class.Actor.Status.Dead;

public class Actor {
    enum Status {Alive, Dead}
    private Status currentStatus;
    private final Float maximumHitPoints;
    private Float currentHitPoints;
    private HitPointChange lastChange;


    public Actor(Float maximumHitPoints) {
        this.maximumHitPoints = maximumHitPoints;
        bringToLife();
    }

    // This is still ugly! What should we do next?
    public void changeMonsterHitPoints(HitPointChange hitPointChange){
        if (hitPointChange.isDamage()){
            applyDamage(hitPointChange);
        } else if (hitPointChange.isHealing()){
            applyHealing(hitPointChange);
        } else {
            reapplyLastChange();
        }
        rememberLastChange(hitPointChange);
    }

    private void rememberLastChange(HitPointChange hitPointChange) {
        lastChange = hitPointChange;
    }

    private void reapplyLastChange() {
        changeMonsterHitPoints(lastChange);
    }

    private void applyHealing(HitPointChange hitPointChange) {
        if (hitPointChange.isRaiseDead()){
            bringToLifeIfDead();
        }
        updateHitPoints(hitPointChange);
        capHitPointsAtMaximum();
    }

    private void applyDamage(HitPointChange hitPointChange) {
        updateHitPoints(hitPointChange);
        killMonsterIfNoRemainingHitPoints();
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

    private void updateHitPoints(HitPointChange hitPointChange) {
        currentHitPoints = hitPointChange.apply(currentHitPoints);
    }

}