package replace_conditional_logic_with_strategy.after;

import java.util.Random;

public class SpellAttack implements Attack{
    public void hit(Actor target) {
        target.applyDamage(new Random().nextInt(5));
    }
}

