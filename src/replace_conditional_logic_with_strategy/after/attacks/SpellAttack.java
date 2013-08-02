package replace_conditional_logic_with_strategy.after.attacks;

import replace_conditional_logic_with_strategy.after.Actor;

import java.util.Random;

public class SpellAttack implements Attack{
    public void attemptToHit(Actor target) {
        target.applyDamage(new Random().nextInt(5));
    }
}

