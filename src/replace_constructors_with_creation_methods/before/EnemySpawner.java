package replace_constructors_with_creation_methods.before;

import replace_constructors_with_creation_methods.Weapon;

import java.util.ArrayList;
import java.util.List;

public class EnemySpawner {

    public List<Actor> spawn(){
        List<Actor> enemies = new ArrayList<Actor>();
        enemies.add(new Actor(false, 10, 15, new Weapon("Sword"), new Weapon("Sword")));
        enemies.add(new Actor(false, 10, 10, new Actor(false, 10, 15, new Weapon("Sword"), new Weapon("Sword"))));
        enemies.add(new Actor(true, 5, 5, 20));
        return enemies;
    }
}
