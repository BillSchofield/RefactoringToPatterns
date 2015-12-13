package replace_conditional_logic_with_strategy.before;

import java.util.Random;

public class Actor {
    private enum AttackType{Sword, Bow, Spell};
    private AttackType attackType;

    public Actor(AttackType attackType) {
        this.attackType = attackType;
    }

    public void attack(Actor target){
        float range = rangeTo(target);
        switch (attackType){
            case Sword:
                if (range < 3.0f){
                    target.applyDamage(3);
                }
                break;
            case Bow:
                if (1.0f < range && range < 20.0f){
                    target.applyDamage((int) (3 - range/10));
                }
                break;
            case Spell:
                target.applyDamage(new Random().nextInt(5));
                break;
        }
    }

    public float rangeTo(Actor actor) {
        return 0;
    }

    public void applyDamage(int damage) {
    }
}
