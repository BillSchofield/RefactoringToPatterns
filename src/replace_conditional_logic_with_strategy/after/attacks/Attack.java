package replace_conditional_logic_with_strategy.after.attacks;

import replace_conditional_logic_with_strategy.after.Actor;

public interface Attack {
    void attemptToHit(Actor target);
}
