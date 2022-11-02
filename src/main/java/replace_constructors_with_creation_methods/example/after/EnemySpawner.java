package replace_constructors_with_creation_methods.example.after;

import java.util.ArrayList;
import java.util.List;

import static replace_constructors_with_creation_methods.example.after.Actor.battleWolf;
import static replace_constructors_with_creation_methods.example.after.Actor.goblinBalloon;
import static replace_constructors_with_creation_methods.example.after.Actor.orc;

public class EnemySpawner {

    public List<Actor> spawn(){
        List<Actor> enemies = new ArrayList<>();
        enemies.add(orc());
        enemies.add(battleWolf().withRider(orc()));
        enemies.add(goblinBalloon());
        return enemies;
    }
}
