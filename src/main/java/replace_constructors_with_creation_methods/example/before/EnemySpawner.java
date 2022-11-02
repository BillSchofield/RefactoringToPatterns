package replace_constructors_with_creation_methods.example.before;

import replace_constructors_with_creation_methods.example.Weapon;

import java.util.ArrayList;
import java.util.List;

public class EnemySpawner {

    public List<Actor> spawn(){
        List<Actor> enemies = new ArrayList<>();
        enemies.add(new Actor(false, 10, 15, new Weapon("Sword"), new Weapon("Sword")));
        enemies.add(new Actor(false, 10, 10, new Actor(false, 10, 15, new Weapon("Sword"), new Weapon("Sword"))));
        enemies.add(new Actor(true, 5, 5, 20));
        return enemies;
    }

    public List<Actor> slightlyBetterSpawn(){
        List<Actor> enemies = new ArrayList<>();

        Actor orc1 = new Actor(false, 10, 15, new Weapon("Sword"), new Weapon("Sword"));
        enemies.add(orc1);

        Actor orc2 = new Actor(false, 10, 15, new Weapon("Sword"), new Weapon("Sword"));
        Actor battleWolf = new Actor(false, 10, 10, orc2);
        enemies.add(battleWolf);

        Actor goblinBalloon = new Actor(true, 5, 5, 20);
        enemies.add(goblinBalloon);

        return enemies;
    }
}
