package replace_constructors_with_creation_methods.after;

import replace_constructors_with_creation_methods.Weapon;

import java.util.List;

import static java.util.Arrays.asList;

public class Actor {

    private static final int defaultViewRange = 10;
    private final boolean canFly;
    private final int hitPoints;
    private final int armor;
    private final int viewRange;
    private final List<Weapon> weapons;
    private Actor rider;

    private Actor(boolean canFly, int hitPoints, int armor, int viewRange, Weapon... weapons) {
        this.canFly = canFly;
        this.hitPoints = hitPoints;
        this.armor = armor;
        this.viewRange = viewRange;
        this.weapons = asList(weapons);
        this.rider = null;
    }


    public static Actor orc() {
        return new Actor(false, 10, 15, defaultViewRange, new Weapon("Sword"), new Weapon("Sword"));
    }

    public static Actor battleWolf() {
        return new Actor(false, 10, 10, defaultViewRange);
    }

    public static Actor goblinBalloon() {
        return new Actor(true, 5, 5, 20);
    }

    public Actor withRider(Actor rider) {
        this.rider = rider;
        return this;
    }

}
