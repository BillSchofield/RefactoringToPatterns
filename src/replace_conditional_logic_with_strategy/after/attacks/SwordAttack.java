package replace_conditional_logic_with_strategy.after.attacks;

import replace_conditional_logic_with_strategy.after.Actor;

public class SwordAttack implements Attack{
    Actor me;

    public SwordAttack(Actor me){
        this.me = me;
    }

    public void attemptToHit(Actor target) {
        float range = target.rangeTo(me);
        if (range < 3.0f){
            target.applyDamage(3);
        }
    }
}
