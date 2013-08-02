package replace_conditional_logic_with_strategy.after;

import replace_conditional_logic_with_strategy.after.attacks.Attack;

public class Actor {
    private Attack attack;

    public Actor(Attack attack) {
        this.attack = attack;
    }

    public void attack(Actor target){
        attack.attemptToHit(target);
    }

    public void applyDamage(int damage) {
    }

    public float rangeTo(Actor target) {
        return 0;
    }
}
