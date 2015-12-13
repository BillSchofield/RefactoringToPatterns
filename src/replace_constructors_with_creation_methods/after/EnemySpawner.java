package replace_constructors_with_creation_methods.after;

import java.util.ArrayList;
import java.util.List;

import static replace_constructors_with_creation_methods.after.Actor.battleWolf;
import static replace_constructors_with_creation_methods.after.Actor.goblinBalloon;
import static replace_constructors_with_creation_methods.after.Actor.orc;

public class EnemySpawner {

    public List<Actor> spawn(){
        List<Actor> enemies = new ArrayList<Actor>();
        enemies.add(orc());
        enemies.add(battleWolf().withRider(orc()));
        enemies.add(goblinBalloon());
        return enemies;
    }
}
