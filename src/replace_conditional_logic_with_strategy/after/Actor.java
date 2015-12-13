package replace_conditional_logic_with_strategy.after;

public class Actor {
    private Attack attack;

    public Actor(Attack attack) {
        this.attack = attack;
    }

    public void attack(Actor target){
        attack.hit(target);
    }

    public void applyDamage(int damage) {
    }

    public float rangeTo(Actor target) {
        return 0;
    }
}
