package replace_constructors_with_creation_methods.before;

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

    public Actor(boolean canFly, int hitPoints, int armor, Weapon... weapons) {
        this.canFly = canFly;
        this.hitPoints = hitPoints;
        this.armor = armor;
        this.viewRange = defaultViewRange;
        this.weapons = asList(weapons);
        this.rider = null;
    }

    public Actor(boolean canFly, int hitPoints, int armor, Actor rider) {
        this.canFly = canFly;
        this.hitPoints = hitPoints;
        this.armor = armor;
        this.viewRange = defaultViewRange;
        this.weapons = asList();
        this.rider = rider;
    }

    public Actor(boolean canFly, int hitPoints, int armor, int viewRange) {
        this.canFly = canFly;
        this.hitPoints = hitPoints;
        this.armor = armor;
        this.viewRange = viewRange;
        this.weapons = asList();
        this.rider = null;
    }
}
