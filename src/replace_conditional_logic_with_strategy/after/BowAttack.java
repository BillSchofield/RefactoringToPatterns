package replace_conditional_logic_with_strategy.after;

public class BowAttack implements Attack{
    private Actor me;

    public BowAttack(Actor me){
        this.me = me;
    }

    public void hit(Actor target) {
        float range = target.rangeTo(me);
        if (1.0f < range && range < 20.0f){
            target.applyDamage((int) (3 - range/10));
        }
    }
}