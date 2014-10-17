package replace_conditional_logic_with_strategy.after;

public class SwordAttack implements Attack{
    private Actor me;

    public SwordAttack(Actor me){
        this.me = me;
    }

    public void hit(Actor target) {
        if (target.rangeTo(me) < 3.0f)
            target.applyDamage(3);
    }
}
