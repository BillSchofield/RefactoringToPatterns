package replace_conditional_logic_with_strategy.after.attacks;

import replace_conditional_logic_with_strategy.after.Actor;

public class SwordAttack implements Attack{
    private Actor me;

    public SwordAttack(Actor me){
        this.me = me;
    }

    public void attemptToHit(Actor target) {
        if (target.rangeTo(me) < 3.0f)
            target.applyDamage(3);
    }
}
